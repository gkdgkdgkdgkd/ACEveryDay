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
// [[-7,-7,-6,-4,-4,1,1],[-10,-9,-8,-7,-7,-5,-2,2],[-10,3],[],[],[-5,-4,-4,-4,-1,-1,4],[],[-10,-5,-3,-1,1,2],[-10,-9,-5,-4,-3,-1,-1]]

class Solution {
    public static void main(String[] args) {
        ListNode x = new ListNode(4);
        x.add(4);
        x.add(9);
        x.add(88);
        x.add(133);
        x.add(1999);
        x.print();
        ListNode y = new ListNode(1);
        y.add(1);
        y.add(3);
        y.add(99);
        y.add(200);
        y.print();
        ListNode z = new ListNode(-7);
        z.add(-7);
        z.add(-6);
        z.add(-4);
        z.add(-4);
        z.add(1);
        z.add(1);
        z.print();
        ListNode [] listNodes = new ListNode[]{x,null,y,z,null};
        ListNode result = new Solution().mergeKLists(listNodes);
        result.print();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode t = lists[0];
        for(int i=1;i<lists.length;++i)
            t = merge(t, lists[i]);
        return t;
    }

    public ListNode merge(ListNode a,ListNode b)
    {
        ListNode head = new ListNode(0);
        ListNode t = head;
        while(a != null && b != null)
        {
            if(a.val < b.val)
            {
                t.next = new ListNode(a.val);
                a = a.next;
            }
            else
            {
                t.next = new ListNode(b.val);
                b = b.next;
            }
            t = t.next;
        }
        while(a != null)
        {
            t.next = new ListNode(a.val);
            a = a.next;
            t = t.next;
        }
        while (b != null) 
        {
            t.next = new ListNode(b.val);
            b = b.next;
            t = t.next;
        }
        return head.next;
    }
}