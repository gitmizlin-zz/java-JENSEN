public class BlackJack {
    public static void main (String[] args) {
        Deck game = new Deck();

        game.newGame();
        game.shuffle();

        System.out.println(game.deck);
    }
}