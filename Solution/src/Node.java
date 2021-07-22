public class Node {
    int val;
    Node next;
    Node random;

    Node(int x) {
        val = x;
        next = null;
        random = null;
    }

    @Override
    public String toString() {
        return val+(next == null ? "" : "->"+ next);
    }
}
