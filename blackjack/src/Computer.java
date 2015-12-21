import static javax.swing.JOptionPane.*;

public class Computer extends Player {
	private Player opponent;

	public Computer(Deck deck, Player opponent) {
		super(deck); // game = deck. game is a common object for human and computer
		this.opponent = opponent;
	}

	@Override
	public void play() {
		while (point < 21 && point < opponent.getPoint())
			drawCard();
		showMessageDialog(null, "Computer's cards: " + cards + "\nComputer's point: " + point);
	}
}
