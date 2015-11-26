public class Player {
	private String name;
	private int score;
	private boolean isCurrentPlayer;

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
