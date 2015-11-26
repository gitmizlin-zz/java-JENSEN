import java.util.ArrayList;

public class GamePlay {
    private Player p1, p2, currentPlayer;
    /**
     * gameEnd is false as long as the game is played.
     */
    public boolean gameEnd = false;

    GamePlay(){

        Player p1 = new Player();
        Player p2 = new Player();
        Player currentPlayer = new Player();
        ArrayList<Player> playerList = {p1, p2, currentPlayer};

        new Status();

        currentPlayer = p1;

        new Board(playerList);
        while (!gameEnd) {

            playTurn();
            changeTurn();

            gameEnd = true;
        }
    }

    public void changeTurn() {
        if (currentPlayer == p1) {
            currentPlayer = p2;
        } else {
            currentPlayer = p1;
        }
    }

    public void playTurn() {
        int i = 0;
        while (i < 3) {
            currentPlayer = currentPlayer;
        }
            changeTurn();
    }
}
