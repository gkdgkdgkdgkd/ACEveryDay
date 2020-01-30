import java.util.ArrayList;
import java.util.List;

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
        ListNode result = new ListNode(0);
        ListNode t = result;
        int len = lists.length;
        int nullNodeNums = 0;
        for(boolean [] b = new boolean[len];nullNodeNums<len;)
        {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int index = 0;index<len;++index)
            {
                ListNode x = lists[index];
                if(x == null)
                {
                    if(!b[index])
                    {
                        b[index] = true;
                        ++nullNodeNums;
                    }
                }
                else if(x.val < min)
                {
                    min = x.val;
                    minIndex = index;
                }
            }
            if(minIndex != -1)
            {
                t.next = new ListNode(min);
                t = t.next;
                lists[minIndex] = lists[minIndex].next;
            }
        }
        return result.next;
    }
}