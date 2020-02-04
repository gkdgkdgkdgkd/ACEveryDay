class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = head;
        ListNode b = head;
        ListNode t = head;
        for(int i=0;i<n;++i)
            a = a.next;
        if(a == null)
            return head.next;
        while(a != null)
        {
            t = b;
            a = a.next;
            b = b.next;
        }
        t.next = t.next.next;
        return head;
    }
}