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
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(ListNode x:lists)
        {
            while(x != null)
            {
                queue.add(x.val);
                x = x.next;
            }
        }
        ListNode s = new ListNode(0);
        ListNode t = s;
        while(!queue.isEmpty())
        {
            t.next = new ListNode(queue.poll());
            t = t.next;
        }
        return s.next;
    }
}