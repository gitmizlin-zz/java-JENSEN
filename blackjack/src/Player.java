public abstract class Player {

	protected Deck game;
	protected Deck hand = new Deck();
	protected int point;
	protected String cards;

	public Player(Deck deck) { // constructor
		game = deck; // all Player objects recognize game (same for everybody)
	}

	public abstract void play(); // overridden in Human and Computer (subclasses)

	public Card drawCard() {
		Card card = game.getCardOnTop();
		hand.addTop(card);
		game.removeCard();
		cards += card.toString() + " ";
		System.out.println("Drawn card: " + card.getSuit() + " " + card.getValue());
		point = point + card.getValue();

		return card;
	}

	public int getPoint() {
		return point;
	}
}	

