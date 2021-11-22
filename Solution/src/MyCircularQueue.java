public class MyCircularQueue {
    private final int capacity;
    private Node head;
    private Node tail;
    private int count;

    public MyCircularQueue(int k) {
        capacity = k;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        ++count;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = head.next;
        --count;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return head.val;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return tail.val;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
