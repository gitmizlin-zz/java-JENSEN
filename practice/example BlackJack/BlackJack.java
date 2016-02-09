import static javax.swing.JOptionPane.*;

public class BlackJack {
	public static void main(String[] args) {
		Deck game = new Deck();
		Human you = new Human(game);
		Computer computer = new Computer(game, you);

		while (true) {
			game.newGame();
			game.shuffle();
			you.play();
			String s = "";

			if (you.getPoint() > 21)
				s = "You lost!";
			else if (you.getPoint() == 21)
				s = "You won!";
			else {
				computer.play();

				if (computer.getPoint() <= 21 && computer.getPoint() >= you.getPoint())
					s = "You lost!";
				else
					s = "You won!";
			}

			int answer = showConfirmDialog(null, s + "\n New game?");
			if (answer != 0)
				break;
		}
	}
}
