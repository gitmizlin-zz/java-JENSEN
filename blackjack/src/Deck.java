import java.util.*;

public class Deck {
	private List<Card> deckOfCards = new LinkedList<Card>();

	public void newGame() {
		deckOfCards.clear();
		System.out.println("deck of cards: " + deckOfCards);
		for (CardSuit suit : CardSuit.values()) {
			for (CardValue value : CardValue.values()) {
				deckOfCards.add(new Card(suit, value));
				// System.out.println(suit.getSuit() + " " + value.getValue());
			}
		}
		shuffle();

		// for (Card c : deckOfCards) {
		// 	System.out.println(c.getSuit() + " " + c.getValue());
		// }
	}

	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}

	public Card getCardOnTop() {
		return deckOfCards.get(0);
	}

	public void removeCard() {
		deckOfCards.remove(0);
	}

	public void addTop(Card card) {
		deckOfCards.add(0, card);
	}

	public void discard() {
		deckOfCards.clear();
	}
}
