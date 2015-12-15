import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<>();

	public void initiateGame() {
		deck.clear();
		for (CardSuit suit : CardSuit.values()) {
			for (CardValue value : CardValue.values()) {
				deck.add(new Card(suit, value));
			}
		}
		shuffle();
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}