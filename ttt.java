import java.util.Scanner;

public class ttt {

	public static final int rows = 3, cols = 3;
	public static final String[][] board = new String[rows][cols];

	public static final String empty = "   ";
	public static final String cross = " X ";
	public static final String nought = " O ";

	public static int row;
	public static int col;

	public static int moveCounter = 0;

	public static int player = 1;
	public static int lastPlayer;

	public static boolean win = false;

	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		initGame();

		play();
	}

	public static void initGame() {
		for (row = 0; row < rows; row++) {
			for (col = 0; col < cols; col++) {
				board[row][col] = empty;
			}
		}
	}

	public static void play() {
		showBoard();

		while(!win) {
			move();
		}
	}

	public static void move() {
		boolean input = false;
		do {

			System.out.print("Player" + player + "'s turn. Enter your indices. (1-3 / 1-3): \n");

			row = keyboard.nextInt() - 1;
			col = keyboard.nextInt() - 1;

			if (row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == empty) {

				if (player == 1) {
					board[row][col]= cross;
					lastPlayer = 1;
					player = 2;
				} else {
					board[row][col] = nought;
					lastPlayer = 2;
					player = 1;
				}

			showBoard();

			} else {
				System.out.println("Invalid input. Enter your indices. (1-3 / 1-3): ");
			}

			input = true;
			moveCounter++;

			if (moveCounter >= 5) {
				if (lastPlayer == 1) {
					checkWinner(cross);
				} else {
					checkWinner(nought);
				}
			} 

			if (win) {
				player = 1;
				move();
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

	public static void checkWinner(String move) {

		for (int row = 0; row < rows; row++) {

			if 	 ((board[row][0] == move
				&& board[row][1] == move
				&& board[row][2] == move)
				||
				  (board[0][col] == move
				&& board[1][col] == move
				&& board[2][col] == move)
				||
				  (board[0][0] == move
				&& board[1][1] == move
				&& board[2][2] == move)
				||
				  (board[0][2] == move
				&& board[1][1] == move
				&& board[2][0] == move)) {

				System.out.println("Player " + lastPlayer + " won.");
				win = true;
				return;
			}
		}
		if (moveCounter == 9) {
			System.out.println("Draw!");
			win = true;
		}
	}
}
