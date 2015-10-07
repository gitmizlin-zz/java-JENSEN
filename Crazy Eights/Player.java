public class Player {
	public String name;
	public boolean inTurn;
	public int nrOfCardsInHand;

	public Player(String name, boolean inTurn, int nrOfCardsInHand) {
		this.name = name;
		this.inTurn = inTurn;
		this.nrOfCardsInHand = nrOfCardsInHand;
	}
}
