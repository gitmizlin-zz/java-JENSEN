import java.util.ArrayList;

public class BlackJack {

	public static void main(String[] args) {
		new Deck();
		Human human = new Human();
		Computer computer = new Computer();

		human.play();
//		computer.play();

	}
}
