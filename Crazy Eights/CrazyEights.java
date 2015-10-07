import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CrazyEights {

	public static Card deck[] = new Card[52];

	public static void main(String[] args) {

		System.out.println(shuffleDeck());
	}

	public static Card[] createDeck() {
		int i = 0;
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		for(String suit : suits) {

			for(int k = 1; k <= 13; k++) {
				Card card = new Card(suit, k);
				deck[i] = card;
				i++;
				// System.out.println(card);
			}
		}
		return deck;
	}

	public static ArrayList<Card> shuffleDeck() {
		ArrayList<Card> shuffledDeck = new ArrayList<Card>(Arrays.asList(createDeck()));

		Collections.shuffle(shuffledDeck);

		return shuffledDeck;
	}
}
