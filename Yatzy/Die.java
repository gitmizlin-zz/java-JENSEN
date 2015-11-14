import javax.swing.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mizuho on 2015-11-14.
 */
public class Die extends JFrame {
    private int faceUp;
    private boolean held;

    Die(int faceUp, boolean held) {
        this.faceUp = faceUp;
        this.held = held;
    }

    int getFaceUp() {
        return faceUp;
    }

    void setFaceUp(int faceUp) {
        this.faceUp = faceUp;
    }

    void toggleHeld() {
        held = !held;
    }

    boolean isHeld() {
        return held;
    }

    void roll() {
        int rand;
        int min = 1;
        int max = 6;
        Random r = new Random();
        rand = r.nextInt(max - min + 1) + min;
        faceUp = rand;
    }
}
