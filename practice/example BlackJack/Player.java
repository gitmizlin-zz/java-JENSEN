public abstract class Player {
	protected Deck game; // the common deck on the table. everybody sees it
	protected Deck hand = new Deck(); // each player's cards in hand
	protected int p; // actual point
	protected String symbols;

	public Player(Deck deck) {
		game = deck; // all Player objects recognize game (same for everybody)
	}

	public abstract void play(); // overridden for each player

	public void newGame() {
		hand.discard();
		p = 0;
		symbols = "";
	}

	public Card newCard() {
		Card card = game.removeTop();
		hand.addTop(card);
		symbols += card.toSymbol() + " ";
		// calculate new point
		int nrOfAces = 0;
		p = 0;
		for (int i = 0; i < hand.nrOfCards(); i++) {
			CardValue v = hand.lookAt(i).getValue(); // enum value (TWO, THREE...)
			p += v.value; // ordinal number in enum (+2)

			if (v == CardValue.ACE)
				nrOfAces++;
		}

		for (int j = 1; j <= nrOfAces && p > 21; j++)
			p -= 13; // count ace as 1 in case the point exceeds 21

		return card; // return the new card
	}

	public int getPoint() {
		return p;
	}
}
