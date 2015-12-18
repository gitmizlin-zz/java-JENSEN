import java.util.ArrayList;

public class Human extends Player {

	public Human(Deck deck) {
		super(deck);
	}

	@Override
	public void play() {
		Deck.deckOfCards.removeCard(0);

		for (Card c : hand)
			System.out.println("Humans hand: " + c);
	}
}
