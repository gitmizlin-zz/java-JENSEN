public class Card {
	public String suit;
	public int value;

	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public Card(String suit, char value) {
		this.suit = suit;
		value = Character.toUpperCase(value);

		switch(value) {
			case 'A': value =  1; break;
			case 'J': value = 11; break;
			case 'Q': value = 12; break;
			case 'K': value = 13; break;
			default: value = value;
		}
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public String toString() { // metod

		String output = "";
		output = suit + " ";

		switch(value) {
			case  1: output += "A"; break;
			case 11: output += "J"; break;
			case 12: output += "Q"; break;
			case 13: output += "K"; break;
			default: output += value; break;
		}
		return output;
	}
}
