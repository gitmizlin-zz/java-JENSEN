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

		System.out.println("*****************************");
		System.out.println("****     WELCOME         ****");
		System.out.println("****       TO            ****");
		System.out.println("****     YATZY!          ****");
		System.out.println("*****************************");

		boolean checker = false;

		do {
			System.out.print("Do you want to read the rules? (y/n) ");
			char userInput = keyboard.next().charAt(0);
			userInput = Character.toLowerCase(userInput);

			if (userInput == 'y') {
				readFile("yatzyrules.txt");
				System.out.println("\n");
				checker = true;

			} else if (userInput == 'n') {
				checker = true;
			} else {
				System.out.print("Invalid input.\n");
				checker = false;
			}

		} while (!checker);
	}

	public List<String> readFile(String filename) {
		List<String> records = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			return records;
		}
		catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
			return null;
		}
	}
}
