import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        Node node = new Node(7);
        node.next = new Node(13);
        node.next.next = new Node(11);
//        node.next.next.next = new Node(10);
//        node.next.next.next.next = new Node(1);
        System.out.println(SOLUTION.copyRandomList(node));
    }
}