public class Card {
	private CardSuit suit;
	private CardValue value;

	public Card(CardSuit suit, CardValue value) {
		this.suit = suit;
		this.value = value;
	}

	public char getSuit() {
		return suit.getSuit();
	}

	public int getValue() {
		return value.getValue();
	}

	@Override
	public String toString() {
		return suit.toString() + value.toString();
	}
}
