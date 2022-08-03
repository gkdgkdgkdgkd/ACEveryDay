public class MyCircularQueue {
    private final int[] queue;
    private int size = 0;
    private int front = 0;
    private int tail = 0;
    private final int capacity;

    public MyCircularQueue(int k) {
        queue = new int[capacity = k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        ++size;
        queue[tail] = value;
        if (++tail >= capacity) {
            tail = 0;
        }
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        --size;
        if (++front >= capacity) {
            front = 0;
        }
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return tail - 1 == -1 ? queue[capacity - 1] : queue[tail - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
