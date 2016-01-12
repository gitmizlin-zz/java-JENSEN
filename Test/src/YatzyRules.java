public class YatzyRules {
	public static boolean isYatzy (int[] dices) {

        for (int i = 0; i < 5; i++) {
            if (dices[i] != 4) {
                break;
            }
            return true;
        }
        return false;
    }
}
