import java.util.Scanner;

public class mic {
	public final int rows = 3, cols = 3;
	public Player currentPlayer;
	public Player nextPlayer;

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
				System.out.print(currentPlayer.name + "'s turn. Enter your indices. (1-3 / 1-3):\n");

				int row = keyboard.nextInt() - 1;
				int col = keyboard.nextInt() - 1;

				if (row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == empty) {
					board[row][col] = currentPlayer.piece;

					if (currentPlayer == p1) {
						nextPlayer = p2;
					} else {
						nextPlayer = p1;
					}

					showBoard();

					input = true;
					++moveCounter;

					if (checkWinner()) {
						System.out.println(currentPlayer.name + " won!");
						gameEnd = true;
					}

					if (moveCounter == (rows * cols) && !checkWinner()) {
						System.out.println("Draw!");
						gameEnd = true;
					}

					currentPlayer = nextPlayer;
				} else {
					System.out.println("Invalid input. Enter your indices. (1-3 / 1-3): ");
				}
			} while (!input);
		} // how to go back to the start?
	}

	public boolean checkWinner() {
		return checkHorizontal() || checkVertical() || checkDiagonal();
	}

	public boolean checkHorizontal() {	
		for (int row = 0; row < rows; row++) {
			String piece = board[row][0];

			if (piece == empty) {
				continue;
			}
			
			for (int col = 0; col < cols; col++) {
				if (board[row][col] != piece) {
					break;
				}

				if (col == cols - 1)
					return true;
			}
		}

		return false;
	}

	public boolean checkVertical() {
		for (int col = 0; col < cols; col++) {
			String piece = board[0][col];

			if (piece == empty) {
				continue;
			}

			for (int row = 0; row < rows; row++) {

				if (board[row][col] != piece) {
					break;
				}

				if (row == rows - 1) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean checkDiagonal() {
		// from upleft to downright
		for (int row = 0; row < rows; row++) {		
			String piece = board[0][0];

			if (piece == empty) {
				continue;
			}

			for (row = 0; row < rows; row++) {

				if (board[row][row] != piece) {
					continue;
				}

				if (row == rows - 1) {
					return true;
				}
			}
		}

		// from upright to downleft
		for (int row = 0, col = cols-1; row < rows; row++, col--) {
			String piece = board[0][cols - 1];
			
			if (piece == empty) {
				break;
			}	

			if (board[row][col] != piece) {
				break;
			}

			if (row + col != cols - 1) {
				break;
			}

			if (row == rows - 1) {
				return true;
			}
		}

		return false;
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
