import java.util.Scanner;

public class TicTacToe {

	public static final int rows = 3, cols = 3, cellSize = 3;
   	public static int[][] board = new int[rows][cols];
	public static int currntRow, currentCol;
   	public static Scanner keyboard = new Scanner(System.in);

	public static void main (String[] args) {

	    drawBoard(rows, cols);
	}


	public static void drawBoard (int row, int col) {


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

		            	fillCell(3);

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
	        case 1: System.out.print("   "); break;
	        case 2: System.out.print(" O "); break;
	        case 3: System.out.print(" X "); break;
	    }
    }

}
