import java.util.Scanner;

public class mic {

	public static final int rows = 3, cols = 3;
	public static final String[][] board = new String[rows][cols];
	public static final String empty = "   ";

	public static void main(String[] args) {

		initGame();
		showBoard();


	}

	public static void initGame() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				board[row][col] = empty;
			}
		}
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
}