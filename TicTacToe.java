import java.util.Scanner;

public class TicTacToe {

	public static final int emp = 0;
	public static final int p1 = 1;
   	public static final int p2 = 2;

	public static final int rows = 3, cols = 3, cellSize = 3;
   	public static String [][] board = new String [rows][cols];
	public static int currntRow, currentCol;
   	public static Scanner keyboard = new Scanner(System.in);

	public static void main (String[] args) {

	    resetBoard();

	    userPlay(1);
	}

	public static void resetBoard () {

	    int numOfLettersInLine = rows * cellSize + rows - 1;
	    String horLine = "-";
	    String cellContent = "   "; // three letters
	    String verLine = "|";

	    for (int i = 1; i <= rows + 2; i++) {
	    	if (i % 2 == 0) {
	       		for (int n = 0; n < numOfLettersInLine; n++) {
	          	System.out.print(horLine);
	        	}
	        } else {
	       		for (int n = 0; n < rows - 1; n += cellSize) {
		            for (int k = 0; k < cellSize; k++) {

		            	fillCell(turn);

		            	if (k != cellSize && k != rows - 1) {
		                	System.out.print(verLine);
		              	}
		            }
	        	}
	    	}
	    	System.out.print("\n");
	    }
    }

    public static void fillCell(int cellContent) {
    	switch (cellContent) {
	        case p1: System.out.print(" X "); break;
	        case p2: System.out.print(" O "); break;
	        case emp: System.out.print("   "); break;
	    }
    }

	public static void userPlay(int turn) {

		boolean userInput = false;

		do {

		    if (turn == 1) {
		    	System.out.println("Player1's turn. Enter the row and column indices: ");
		    } else {
		    	System.out.println("Player2's turn. Enter the row and column indices: ");
		    }

		    int row = keyboard.nextInt() - 1;
		    int col = keyboard.nextInt() - 1;


		    if (row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == "   ") {

		    	if (turn == 1) {
		    		fillCell(p1);
		    		turn = 2;

		    	} else {
		    		fillCell(p2);
		    		turn = 1;
		    	}

		    	userInput = true;

		    } else {
		    	System.out.print("The cell is already taken.\nChoose another cell: ");
			}

	    } while (userInput != true);

  	}
}
