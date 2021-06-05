public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode newHead = null;
        ListNode pre = null;
        while (true){
            while (temp != null && temp.val == val){
                temp = temp.next;
            }
            if(temp != null) {
                if (newHead == null) {
                    newHead = temp;
                    pre = temp;
                } else {
                    pre.next = temp;
                    pre = pre.next;
                }
                temp = temp.next;
            }else{
                break;
            }
        }
        if(pre != null){
            pre.next = null;
        }
        return newHead;
    }
}