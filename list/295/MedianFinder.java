import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
    private final PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.reverseOrder());
    private final PriorityQueue<Integer> max = new PriorityQueue<>();
    private int minLen = 0;
    private int maxLen = 0;

    public void addNum(int num) {
        max.add(num);
        ++maxLen;
        if (maxLen - minLen == 2) {
            min.add(max.poll());
            --maxLen;
            ++minLen;
        }
        if (minLen != 0 && min.peek() > max.peek()) {
            max.add(min.poll());
            min.add(max.poll());
        }
    }

    public double findMedian() {
        if (maxLen > minLen) {
            return max.peek();
        }
        return (max.peek() + min.peek()) / 2.0;
    }
}
