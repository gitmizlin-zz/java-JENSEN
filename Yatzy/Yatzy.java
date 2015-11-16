import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yatzy {
	public Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		new Yatzy();
	}

	public Yatzy() { // Constructor
		new Board();
	}

}
