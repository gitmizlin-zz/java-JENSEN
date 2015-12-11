import static javax.swing.JOptionPane.*;

public class Computer extends Player {
	private Player opponent;

	public Computer(Deck deck, Player opponent) {
		super(deck);
		this.opponent = opponent;
	}

	@Override
	public void play() {
		newGame();
		while (p < 21 && p < opponent.getPoint())
			newCard();
		showMessageDialog(null, "Computer has " + symbols + " and " + p + " points.");
	}
}
