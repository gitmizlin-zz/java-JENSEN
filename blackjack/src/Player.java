public abstract class Player {

	protected Deck game;
	protected Deck hand = new Deck();
	protected int point;
	protected String cards;

	public Player(Deck deck) { // constructor
		game = deck; // all Player objects recognize game (same for everybody)
	}

	public abstract void play(); // overridden in Human and Computer (subclasses)

	public void newGame() {
		hand.discard();
		point = 0;
		cards = "";
	}

	public Card drawCard() {
		Card card = game.getCardOnTop();
		hand.addTop(card);
		cards += card.toString() + " ";
		game.removeCard();
		System.out.println("Drawn card: " + card.getSuit() + " " + card.getValue());
		point = point + card.getValue();
		System.out.println("cards: " + cards);
		return card;
	}

	public int getPoint() {
		return point;
	}
}

