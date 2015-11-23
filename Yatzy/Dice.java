import java.util.Observable;
import java.util.Random;

/**
 * Created by mizuho on 2015-11-14.
 */
public class Dice extends Observable implements DiceInterface, Comparable {
    private int value = 1;
    private boolean held;

    Dice() {
        this(1, false);
    }

    Dice(int value, boolean held) {
        this.value = value;
        this.held = held;
    }

    void toggleHeld() {
        held = !held;
    }

    boolean isHeld() {
        return held;
    }

    @Override
    public void roll() {
        int rand;
        int min = 1;
        int max = 6;
        Random r = new Random();
        rand = r.nextInt(max - min + 1) + min;
        value = rand;
        setChanged();
        notifyObservers();
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Object o) {
        Dice d = (Dice) o;
        return (Integer.toString(this.getValue())).compareTo(Integer.toString(d.getValue()));
    }

}

