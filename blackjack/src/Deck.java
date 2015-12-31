import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Card> deck = new ArrayList<>();

    public void newGame() {
        deck.clear();
        for (CardSuit c : CardSuit.values())
            for (CardValue v : CardValue.values())
                deck.add(new Card(c, v));
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
}