public class Player {
	private String name;
	private int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public Player() {
		this("Player name", 0);
	}

	public String getName() {
		return name;
	}
}
