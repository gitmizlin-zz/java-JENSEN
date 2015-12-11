public enum CardColor {
	CLOVER('\u2663'),
	DIAMOND('\u2666'),
	SPADE('\u2660'),
	HEART('\u2665');

	public final char symbol;

	CardColor(char c) { // constructor
		symbol = c;
	}
}