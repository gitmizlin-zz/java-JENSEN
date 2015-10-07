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

	public Card() {
		int i = 0;
		Card deck[] = new Card[52];
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		for(String suit : suits) {

			for(int k = 1; k <= 13; k++) {
				Card card = new Card(suit, k);
				deck[i] = card;
				i++;
			}
		}
		return i;

	}

}
