/**
 * Definition for singly-linked list. 
 * public class ListNode 
 * { 
    * int val; 
    * ListNode next; 
    * ListNode(int x) { val = x; } 
 * }
 */

class ListNode
{
    int val;
    ListNode next = null;
    ListNode(int x)
    {
        val = x;
    }
}

class Solution {
    public static void main(String[] args) {
        ListNode l1 = null;
        add(l1,9);
        add(l1,1000);

        ListNode l2 = new ListNode(5);
        add(l2,8);
        add(l2,9);
        add(l2,999);

        System.out.println(print(l1));
        System.out.println(print(l2));
        System.out.println(print(new Solution().mergeTwoLists(l1, l2)));
    }

    public static String print(ListNode t)
    {
        if(t != null)
            return t.val + (t.next != null ? "->" : "") + print(t.next);
        return "";
    }

    public static void add(ListNode head,int val)
    {
        if(head == null)
        {
            head = new ListNode(val);
            return ;
        }
        while(head.next != null)
            head = head.next;
        head.next = new ListNode(val);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = null;
        if(l1.val < l2.val)
        {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        }
        else
        {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}