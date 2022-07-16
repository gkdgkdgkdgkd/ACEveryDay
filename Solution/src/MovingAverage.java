import java.util.Arrays;

public class MovingAverage {
    private final int[] queue;
    private int front = 0;
    private int tail = 0;
    private int sum = 0;
    private final int size;

    public MovingAverage(int size) {
        queue = new int[this.size = size];
    }

    public double next(int val) {
        if (tail < size) {
            queue[tail++] = val;
            sum += val;
            return sum / (double) (tail - front);
        }
        sum += val - queue[front++ % size];
        queue[tail++ % size] = val;
        return sum / (double) size;
    }
}
