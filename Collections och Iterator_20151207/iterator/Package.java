import java.util.*;

/**
 * Created by oscar on 2015-12-07.
 */
public class Package extends Gift implements Iterable {
    int value;
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package(String name, int value) {
        super(name);
        this.value = value;

    }
    public void add(Gift gift) {
        gifts.add(gift);
    }

    @Override
    public int getValue() {
        int sum = value;
        for(Gift g : gifts) {
            sum += g.getValue();
        }
        return sum;
    }

    @Override
    public String toString() {
        String str = "[" + getName() + "]\n";
        for(Gift g : gifts) {

            str += "- " + g + "\n";
        }
        return str;
    }

    private ArrayList<Gift> getGifts() {
        return gifts;
    }

    class DepthFirstPackageIterator implements Iterator {

        Deque queue = new ArrayDeque<>(); 

        DepthFirstPackageIterator() {
            Collections.reverse(gifts);
            queue.addAll(gifts);
            Collections.reverse(gifts);
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public Object next() {
            Gift g = (Gift) queue.removeLast();
            if (g instanceof Package) {
                Collections.reverse(((Package) g).gifts);
                queue.addAll(((Package) g).gifts);
                Collections.reverse(((Package) g).gifts);
            }
            return g;
        }
    }

    class BreadthFirstPackageIterator implements Iterator {

        Deque queue = new ArrayDeque<>(gifts);

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public Object next() {
            Gift g = (Gift)queue.removeFirst();
            if (g instanceof Package) {
                queue.addAll(((Package) g).gifts);
            }
            return g;
        }
    }
    @Override
    public Iterator iterator() {
        Iterator myIterator = new DepthFirstPackageIterator();
        return myIterator;
    }


}
