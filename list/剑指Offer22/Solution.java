import node.ListNode;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        ListNode res = head;

        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }

        while (temp != null) {
            temp = temp.next;
            res = res.next;
        }
        return res;
    }
}