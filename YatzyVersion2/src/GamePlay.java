public class GamePlay {
    private Player p1, p2, currentPlayer;
    public boolean gameEnd = false;
    public int turnCount;

    GamePlay(){
        p1 = new Player();
        p2 = new Player();
        currentPlayer = p1;

        new Status();
        new Board();


        while (!gameEnd) {

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


    public int getTurnCount() {
        return turnCount;
    }

}
