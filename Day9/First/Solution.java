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
        ListNode [] listNodes = new ListNode[]{x,y};
        ListNode result = new Solution().mergeKLists(listNodes);
        result.print();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> s = new ArrayList<>();
        for(ListNode x:lists)
        {
            while(x != null)
            {
                s.add(x.val);
                x = x.next;
            }
        }
        s.sort((a,b) -> {return a.compareTo(b);});
        ListNode result = new ListNode(0);
        ListNode t = result;
        for(Integer x:s)
        {
            t.next = new ListNode(x);
            t = t.next;
        }
        return result.next;
    }
}