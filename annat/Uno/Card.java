public class Uno {

	public Player p1 = new Player("Player1", false, 1, 0);
	public Player p2 = new Player("Computer", true, 2, 0);

	public static void main(String[] args) {
		new Uno(); // create a new instance of class Uno, will call constructor

	}

	public Uno() { // Constructor

		dealCard();

		System.out.println(p1.nrOfCardsInHand);
	}

	public void dealCard() {
		p1.nrOfCardsInHand = 26;
		p2.nrOfCardsInHand = 26;
	}
}