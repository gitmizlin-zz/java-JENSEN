import java.util.Random;

public class Dice implements Comparable {
    private int value = 1;
    private boolean held;

    Dice() {
        this(1, false);
    }

    Dice(int value, boolean held) {
        this.value = value;
        this.held = held;
    }

    public void toggleHeld() {
        held = !held;
    }

    public boolean isHeld() {
        return held;
    }

    public void roll() {
        int rand;
        int min = 1;
        int max = 6;

        Random r = new Random();
        rand = r.nextInt(max - min + 1) + min;
        value = rand;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Object o) {
        Dice d = (Dice) o;
        return (Integer.toString(this.getValue())).compareTo(Integer.toString(d.getValue()));
    }
}
