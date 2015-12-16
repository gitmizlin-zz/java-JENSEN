public class Human extends Player {
	Deck deck;

	@Override
	public void play() {
		// hand.add(deck.getCardOnTop());
		System.out.println("Humans hand: " + hand);
	}
}
