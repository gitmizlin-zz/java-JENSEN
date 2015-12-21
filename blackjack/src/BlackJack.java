import static javax.swing.JOptionPane.*;

public class BlackJack {

	public static void main(String[] args) {
		Deck game = new Deck();
		Human human = new Human(game);
		Computer computer = new Computer(game, human);

		while (true) {
			game.newGame();
			human.play();
			String message = "";

			if (human.getPoint() > 21)
				message = "You lost.";
			else if (human.getPoint() == 21)
				message = "You won.";
			else {
				computer.play();

				if (computer.getPoint() <= 21 && computer.getPoint() >= human.getPoint())
					message = "You lost.";
				else
					message = "You won.";
			}

			int answer = showConfirmDialog(null, message + "\nNew game?");

			if (answer != 0)
				break;
		}
	}
}
