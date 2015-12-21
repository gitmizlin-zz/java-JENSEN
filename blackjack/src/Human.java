import static javax.swing.JOptionPane.*;

public class Human extends Player {

	public Human(Deck deck) {
		super(deck);
	}

	@Override
	public void play() {
		while (point < 21) {
			if (point < 21)
				drawCard();
				int answer = showConfirmDialog(null, "Your cards: " + cards + "\nYour point: " + point + "\nDo you want to draw one more card?");

				if (answer == 1)
					break;
				else if (answer == 2)
					System.exit(0);			
			else
				showMessageDialog(null, "Your cards: " + cards + "\nYour point: " + point);
		}
	}	
}
