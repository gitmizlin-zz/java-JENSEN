import java.util.Scanner;

public class ttt {
	public static final int rows = 3, cols = 3;
	public static final String[][] board = new String[rows][cols];

	public static final String empty = "   ";
	public static final String cross = " X ";
	public static final String nought = " O ";

	public static int moveCounter = 0;

	public static int currentPlayer = 1;

	public static boolean win = false;

	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		initGame();

		play();
	}

	public static void initGame() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				board[row][col] = empty;
			}
		}
	}

	public static void play() {
		showBoard();

		while(!win) {
			move();
		}
		initGame();
	}

	public static void move() {
		boolean input = false;

		do {
			System.out.print("Player " + currentPlayer + "'s turn. Enter your indices. (1-3 / 1-3): \n");

			int row = keyboard.nextInt() - 1;
			int col = keyboard.nextInt() - 1;

			if (row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == empty) {
				if (currentPlayer == 1) {
					board[row][col] = cross;
					currentPlayer = 2;
				} else {
					board[row][col] = nought;
					currentPlayer = 1;
				}

				showBoard();
			} else {
				System.out.println("Invalid input. Enter your indices. (1-3 / 1-3): ");
			}

			input = true;
			moveCounter++;
		
			if (moveCounter >= 5) {
				if (currentPlayer == 1) {
					checkWinner(cross);		
				} else {
					checkWinner(nought);		
				}

				if (!win && moveCounter == 9) {
				System.out.println("Draw!");
				}
			} 	

		} while (!input);
	}

	public static void showBoard() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(board[row][col]);

				if (col != cols - 1) {
					System.out.print("|");
				}
			}

			System.out.println();

			if (row != rows - 1) {
				for (int col = 0; col < cols * 3 + 2; col++) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static boolean checkHorizontal(String move) {
		boolean win = false;
		for (int row = 0; row < rows; row++) {
			for (int col = 0, i = 0; col < cols; col++) {	
				move = board[0][0];	
				if (board[row][col] != move) {
					return false;
				} 
			}
		}
		System.out.println("hor" + win);
		return true;
	}

	public static boolean checkVertical(String move) {
		boolean win = true;
		move = board[0][0];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; ) {				
				if (board[row][col] != move) {
					win = false;
				}
			}
		} 
		System.out.println("ver" + win);
		return win;
	}

	public static boolean checkDiagonal(String move) {
		boolean win = false;
		move = board[0][0];
		for (int row = 0, col = 0; row < rows && col < cols; row++, col++) {
			if (board[row][col] != move) {
				win = false;
			}
		}

    	move = board[0][cols];
		for (int row = 0, col = cols; row < rows && col < cols; row++, col--) {
			if (board[row][col] != move) {
				win = false;
			}
		}
		System.out.println("dia" + win);
		return win;
	}

	public static void checkWinner(String move) {
		if (checkHorizontal(move) || checkVertical(move) || checkDiagonal(move)) {
			System.out.println(currentPlayer + " has won!");		
			currentPlayer = 1;
			move();
		} else {
			System.out.println("currentplayer = " + currentPlayer);
		}
	}
}

			