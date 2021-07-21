import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception{

        ListNode publicList = new ListNode(8);
        publicList.next = new ListNode(4);
        publicList.next.next = new ListNode(5);

        ListNode p1 = new ListNode(4);
        p1.next = new ListNode(1);
        p1.next.next = publicList;

        ListNode p2 = new ListNode(5);
        p2.next = new ListNode(0);
        p2.next.next = new ListNode(1);
        p2.next.next.next = publicList;

        System.out.println(SOLUTION.getIntersectionNode(p1,p2));
    }
}