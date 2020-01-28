class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        ListNode head_copy = head;
        int length = 0;
        while(head != null)
        {
            head = head.next;
            ++length;
        }
        head = head_copy;
        ListNode before = head;
        int i = 0;
        for(;i<length-n;++i)
        {
            before = head;
            head = head.next;
        }
        if(i == 0)
            return head.next;
        else
            before.next = before.next.next;
        return head_copy;
    }
}