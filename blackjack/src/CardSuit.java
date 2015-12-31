public enum CardSuit {
    DIAMONDS('\u2662'),
    HEARTS('\u2661'),
    SPADES('\u2660'),
    CLUBS('\u2663');

    private final char cardSuit;

    CardSuit(char cardSuit) { // constructor
        this.cardSuit = cardSuit;
    }
}


