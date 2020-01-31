import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
    }
    void add(int x)
    {
        ListNode t = this;
        while(t.next != null)
            t = t.next;
        t.next = new ListNode(x);
    }
    void print()
    {
        ListNode t = this;
        while(t != null)
        {
            System.out.print(t.val);
            if((t = t.next) != null)
                System.out.print("->");
        }
        System.out.println();
    }
}

class Solution {
    public static void main(String[] args) {
        ListNode x = new ListNode(4);
        x.add(4);
        x.add(9);
        x.add(88);
        x.add(133);
        x.add(1999);
        ListNode y = new ListNode(1);
        y.add(1);
        y.add(3);
        y.add(99);
        y.add(200);
        ListNode z = new ListNode(-7);
        z.add(-5);
        z.add(-6);
        z.add(-3);
        z.add(-4);
        z.add(-99999);
        z.add(10000000);
        ListNode result = new Solution().swapPairs(z);
        result.print();
    }

    public ListNode swapPairs(ListNode head) 
    {
        if(head != null && head.next != null)
        {
            ListNode t = head.next;
            head.next = swapPairs(t.next);
            t.next = head;
            return t;
        }
        return head;
    }
}