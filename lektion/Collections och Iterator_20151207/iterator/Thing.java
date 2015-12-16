/**
 * Created by oscar on 2015-12-07.
 */
public class Thing extends Gift {
    int value;

    public Thing(String name, int value) {
        super(name);
        this.value = value;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int getValue() {
        return value;
    }
}
