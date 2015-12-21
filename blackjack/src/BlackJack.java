import java.util.ArrayList;

public class BlackJack {

	public static void main(String[] args) {
		Deck game = new Deck();
		Human human = new Human(game);
		// Computer computer = new Computer();

		game.newDeck();

		human.play();
//		computer.play();

	}
}
