import java.util.HashMap;
import java.util.Scanner;

public class MorseCode { // *1
	public Scanner keyboard = new Scanner(System.in);
	String userText;

	public static void main(String[] args) {
		new MorseCode(); // create a new instance of *1, will call *1 constructor
	}

	public MorseCode() { // constructor of *1
		userText = askInput().toLowerCase();
		System.out.print(convertToMorse());
	}

	public String askInput() {
		System.out.print("Enter your text: ");
		return keyboard.nextLine();
	}

	public String convertToMorse() {
		HashMap<String, String> morse = new HashMap<String, String>();
		morse.put("a", ".-");
		morse.put("b", "-...");
		morse.put("c", "-.-.");
		morse.put("d", "-..");
		morse.put("e", ".");
		morse.put("f", "..-.");
		morse.put("g", "--.");
		morse.put("h", "....");
		morse.put("i", "..");
		morse.put("j", ".---");
		morse.put("k", "-.-");
		morse.put("l", ".-..");
		morse.put("m", "--");
		morse.put("n", "-.");
		morse.put("o", "---");
		morse.put("p", ".--.");
		morse.put("q", "--.-");
		morse.put("r", ".-.");
		morse.put("s", "...");
		morse.put("t", "-");
		morse.put("u", "..-");
		morse.put("v", "...-");
		morse.put("w", ".--");
		morse.put("x", "-..-");
		morse.put("y", "-.--");
		morse.put("z", "--..");
		morse.put("å", ".--.-");
		morse.put("ä", ".-.-");
		morse.put("ö", "---.");
		morse.put("0", "-----");
		morse.put("1", ".----");
		morse.put("2", "..---");
		morse.put("3", "...--");
		morse.put("4", "....-");
		morse.put("5", ".....");
		morse.put("6", "-....");
		morse.put("7", "--...");
		morse.put("8", "---..");
		morse.put("9", "----.");
		morse.put(".", ".-.-");
		morse.put(",", "--..--");
		morse.put("?", "..--..");
		morse.put(" ", "/ ");

		String currentChar;
		String getMorseChar;
		String convertedString = "";

		for (int i = 0; i < userText.length(); i++) {
			currentChar = String.valueOf(userText.charAt(i));
			getMorseChar = morse.get(currentChar);

			if (getMorseChar.equals(" ")) {
				convertedString = convertedString + "  |  ";
			} else  {
				convertedString = convertedString + getMorseChar + " ";
			}
		}
		String endOfMessage = morse.get("a") + morse.get("r");
		convertedString = convertedString + endOfMessage;
		return convertedString;
	}

	public String convertToText() {
		BiMap<String, Character> morseToText = morse.inverse();

		for (String morseLetter: userText.split(" ")) {

		}


	}
}
