public class RecentCounter {
    private final int[] list = new int[3002];
    private int front = 0;
    private int tail = 0;
    private int size = 0;

    public int ping(int t) {
        while (front != tail && t - list[front] > 3000) {
            --size;
            if (++front > 3001) {
                front = 0;
            }
        }
        list[tail++] = t;
        ++size;
        if (tail > 3001) {
            tail = 0;
        }
        return size;
    }
}
