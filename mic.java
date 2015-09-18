import java.util.Scanner;

public class mic {
	public final int rows = 3, cols = 3;
	public Player currentPlayer;

	public Scanner keyboard = new Scanner(System.in);

	public final String[][] board = new String[rows][cols];
	public final String empty = "   ";

	public Player p1;
	public Player p2;

	public static void main(String[] args) {
		new mic();
	}

	public mic() {
		String player1 = askName(1);
		String player2 = askName(2);

		this.p1 = new Player(player1, " X ", 1);
		this.p2 = new Player(player2, " 0 ", 2);

		initGame();
		showBoard();
		move();
	}

	public String askName(int playerNumber) {
		System.out.println("Player" + playerNumber + "'s name? ");
		return keyboard.next();
	}

	public void initGame() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				board[row][col] = empty;
			}
		}
	}

	public void showBoard() {
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

	public void move() {
		boolean input = false;
		boolean gameEnd = false;
		currentPlayer = p1;
		int moveCounter = 0;

		while (!gameEnd) {

			do {
				System.out.print(currentPlayer.name + "'s turn. Enter your indices. (1-3 / 1-3): \n");

				int row = keyboard.nextInt() - 1;
				int col = keyboard.nextInt() - 1;

				if (row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == empty) {

					if (currentPlayer == p1) {
						board[row][col] = p1.piece;
						currentPlayer = p2;
					} else {
						board[row][col] = p2.piece;
						currentPlayer = p1;
					}
					showBoard();
				} else {
					System.out.println("Invalid input. Enter your indices. (1-3 / 1-3): ");
				}

				input = true;
				++moveCounter;

				if (moveCounter >= 5 && checkWinner()) {
					System.out.println(currentPlayer.name + " won!");
					gameEnd = true;
				}

				if (moveCounter == 9) {
					System.out.println("Draw!");
					gameEnd = true;
				}

			} while (!input);
		} // how to go back to the start?
	}

	public boolean checkWinner() {
		if (checkHorizontal(currentPlayer.piece)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkHorizontal(String move) {
		for (int row = 0; row < rows; row++) {
			for (int col = 0, i = 0; col < cols; col++) {
				move = board[0][0];
				if (board[row][col] != move) {
					System.out.println(move + board[row][col]);
					return false;
				}
			}
		}
		System.out.println("hor true!");
		return true;
	}
}

class Player {
	public String name;
	public String piece;
	public int playerNo;

	public Player(String name, String piece, int playerNo) {
		this.name = name;
		this.piece = piece;
		this.playerNo = playerNo;
	}
}
