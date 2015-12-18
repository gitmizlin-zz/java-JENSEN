import java.util.*;

public class Deck {
	private List<Card> deck = new LinkedList<Card>();

	public void addTop(Card card) {
		deck.add(0, card);
	}

	public Card removeTop() {
		Card card = deck.get(0);
		deck.remove(0);
		return card;
	}

	public int nrOfCards() {
		return deck.size();
	}

	public void discard() {
		deck.clear();
	}

	public Card lookAt(int n) {
		return deck.get(n);
	}

	public Card remove(int n) {
		Card card = deck.get(n);
		deck.remove(n);
		return card;
	}

	public int search(CardColor cardColor, CardValue cardValue) {
		int i = 0;
		for (Card c : deck)
			if (c.getColor() == cardColor && c.getValue() == cardValue)
				return i;
			else
				i++;
		return -1;
	}

	public void newGame() {
		deck.clear();
		for (CardColor cardColor : CardColor.values()) // values(): predefined method automatically containd in enum. Returns an array of enum values
			for (CardValue cardValue : CardValue.values())
				deck.add(new Card(cardColor, cardValue));
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}
