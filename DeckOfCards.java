// 2015-10-08. In class by Oscar

import java.util.ArrayList;

public class DeckOfCards {

	private static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

	// class method
	public static ArrayList<PlayingCard> getDeckOfCards() {
		ArrayList<PlayingCard> myDeckOfCards = new ArrayList<>();	

		for(String theSuit : suits) {
			for(int i = 1; i <= 13; i++) {
				PlayingCard someCard = new PlayingCard(theSuit, i);

				myDeckOfCards.add(someCard);
			}
		}
		return myDeckOfCards;
	}
}