public class Card {
	private Cardcolor cardColor;
	private CardValue cardValue;

	public Card(Cardcolor cardColor, CardValue cardValue) { // constructor
		this.cardColor = cardColor;
		this.cardValue = cardValue;
	}

	public CardColor getColor() {
		return cardColor;
	}

	public CardValue getValue() {
		return cardValue;
	}

	@Override
	public String toString() {
		return cardColor.toString() + " " + cardValue.toString();
	}

	public String toSymbol() {
		return cardColor.symbol + cardValue.symbol;
	}
}
