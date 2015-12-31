public class Card {
    private CardSuit suit;
    private CardValue value;

    public Card (CardSuit suit, CardValue value) { // constructor
        this.suit = suit;
        this.value = value;
    }

    public CardValue getValue() {
        return value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return suit.toString() + " " + value.toString();
    }

}