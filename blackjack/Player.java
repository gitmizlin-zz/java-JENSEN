import java.util.ArrayList;

public abstract class Player {

	protected int point;
	protected ArrayList<Card> hand = new ArrayList<>();

	public abstract void play();
}
