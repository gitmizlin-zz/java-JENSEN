import java.util.ArrayList;
import java.util.*;

public class Deck {
	private ArrayList<Card> deckOfCards = new ArrayList<>();

	public Deck() {
		deckOfCards.clear();
		for (CardSuit suit : CardSuit.values()) {
			for (CardValue value : CardValue.values()) {
				deckOfCards.add(new Card(suit, value));
				System.out.println(suit.getSuit() + " " + value.getValue());
			}
		}
		shuffle();
	}

	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}

	public ArrayList<Card> getDeckOfCards() {
		return deckOfCards;
	}

	public Card getCardOnTop() {
		return deckOfCards.get(0);
	}
}
