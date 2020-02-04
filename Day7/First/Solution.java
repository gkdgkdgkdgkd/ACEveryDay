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

        ListNode l2 = new ListNode(5);
        add(l2,8);
        add(l2,9);

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
        while(head.next != null)
            head = head.next;
        head.next = new ListNode(val);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t = new ListNode(0);
        ListNode head = t;
        while(l1 != null && l2 != null)    
        {
            if(l1.val < l2.val)
            {
                t.next = l1;
                l1 = l1.next;
            }
            else
            {
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;
        }
        while(l1 != null)
        {
            t.next = l1;
            l1 = l1.next;
            t = t.next;
        }
        while(l2 != null)
        {
            t.next = l2;
            l2 = l2.next;
            t = t.next;
        }
        return head.next;
    }
}