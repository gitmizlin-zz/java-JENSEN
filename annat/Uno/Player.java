public class Player {
	public String name;
	public boolean bot;
	public int playerNr;
	public int nrOfCardsInHand;

	public Player(String name, boolean bot, int playerNr, int nrOfCardsInHand) {
		this.name = name;
		this.bot = bot;
		this.playerNr = playerNr;
	}
}
