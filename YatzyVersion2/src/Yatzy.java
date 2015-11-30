/* Features left:
* Make only one score selectable per turn
* Make scores unselectable before game start
* Make scores with 0 point unselectable (or not show point)
* Status with instruction: "Roll dice", "Hold dice or place a score", "Remaining rolls" (3-0)
* Change the color of row, not only cell
* Layout (table-border, background image, button design etc)
* Documentation*
*/

public class Yatzy {

	public static void main(String[] args) {
		new Yatzy();
	}

	public Yatzy() { // Constructor
		new GamePlay();
	}
}
