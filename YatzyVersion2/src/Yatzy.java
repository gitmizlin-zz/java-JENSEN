/* Features left:
* Change the color in the right cells in the table
* Make sum/bonus/Total score rows unclickable
* Make only one hand clickable until next turn begins
* Make hands unclickable before throwing dice
* Make hands with 0 point unclickable
* status field to display what to do / what chosen etc
* Layout
* Documentation
*
*/

public class Yatzy {

	public static void main(String[] args) {
		new Yatzy();
	}

	public Yatzy() { // Constructor
		new GamePlay();
	}
}
