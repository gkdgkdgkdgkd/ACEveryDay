import node.ListNode;

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            ++len;
        }
        int mod = len % k;
        len = len / k;
        ListNode[] res = new ListNode[k];
        for (int i = 0; i < k; i++) {
            if (head == null) {
                res[i] = null;
                continue;
            }
            temp = head;
            ListNode pre = null;
            for (int j = len + (mod-- > 0 ? 1 : 0); j > 0; --j) {
                pre = head;
                head = head.next;
            }
            pre.next = null;
            res[i] = temp;
        }
        return res;
    }
}