import java.util.Scanner;

public class Yatzy {
	public Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		new Yatzy();
	}

	public Yatzy() { // Constructor
		new GamePlay();
	}
}
