import static javax.swing.JOptionPane.*;

public class Human extends Player {
	public Human(Deck deck) {
		super(deck);
	}

	@Override
	public void play() {
		newGame();
		while (p < 21) {
			newCard();
			if (p < 21) {
				int answer = showConfirmDialog(null,
								"You have " + symbols + " and " + p + "." +
								"\n Du you want to draw one more?" );

				if (answer == 1)
					break;
				else if (answer == 2)
					System.exit(0);
			}
			else
				showMessageDialog(null, "You have " + symbols + " and " + p + ".");
		}
	}
}
