import java.util.ArrayList;

public abstract class Player {

	protected Deck game;

	protected int point;
	public Player(Deck deck) {
		game = deck; // all Player objects recognize game (same for everybody)
	}

	public abstract void play();
}
