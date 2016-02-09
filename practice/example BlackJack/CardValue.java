public enum CardValue {
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("10"),
	JACK("J"),
	QUEEN("Q"),
	KING("K"),
	ACE("A");

	public final int value = ordinal() + 2;
	public final String symbol;

	CardValue(String sym) { // constructor
		symbol = sym;
	}
}