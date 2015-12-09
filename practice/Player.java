public class Player {
	protected Deck game;
	protected Deck hand = new Deck();
	protected int p; // actual point
	protected String symbols;

	public Player(Deck deck) {
		game = deck;
	}

	public abstract void play();

	public void newGame() {
		hand.discard();
		p = 0;
		symbols = "";
	}

	public Card newCard() {
		Card card = game.removeTop();
		hand.addTop(card);
		symbols += card.toSymbol() + "   ";
		// calculate new point
		int nrOfAces = 0;
		p = 0;
		for (int i = 0; i < hand.nrOfCards(); i++) {
			CardValue v = hand.lookAt(i).getValue();
			p += v.getValue;

			if (v == CardValue.ACE)
				nrOfAces++;
		}

		for (int j = 1; j <= nrOfAces && p > 21; j++)
			p -= 13; // count ace as 1

		return card; // return the new card
	}

	public int point() {
		return p;
	}
}
