public enum CardSuit {
	HEART('\u2665'),
	DIAMOND('\u2666'),
	SPADE('\u2660'),
	CLOVER('\u2663');

	private final char suitChar;

	private CardSuit(char suitChar) { // constructor
		this.suitChar = suitChar;
	}

	public char getSuit() {
		return suitChar;
	}
}
