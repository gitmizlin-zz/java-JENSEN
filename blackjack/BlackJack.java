public class BlackJack {

	public static void main(String[] args) {
		Deck geme = new Deck();
		Human human = new Human();
		Computer computer = new Computer();

		human.play();
		computer.play();

	}
}
