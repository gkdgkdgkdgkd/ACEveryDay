import node.ListNode;

import java.util.Random;

public class Solution {
    private final ListNode head;
    private final Random random = new Random();

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int res = 0;
        int index = 0;
        ListNode p = head;
        while (p != null && ++index >= 0) {
            if (random.nextInt(index) == 0) {
                res = p.val;
            }
            p = p.next;
        }
        return res;
    }
}