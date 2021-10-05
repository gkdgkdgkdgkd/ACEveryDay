import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private int nextVal = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public Integer peek() {
        if (nextVal == 0){
            return nextVal = iterator.next();
        }
        return nextVal;
    }

    @Override
    public Integer next() {
        if (nextVal == 0){
            return iterator.next();
        }
        int res = nextVal;
        nextVal = 0;
        return res;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext() || nextVal != Integer.MAX_VALUE;
    }
}
