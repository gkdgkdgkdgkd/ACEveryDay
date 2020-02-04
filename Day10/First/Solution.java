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
        ListNode y = new ListNode(1);
        y.add(1);
        y.add(3);
        y.add(99);
        y.add(200);
        ListNode z = new ListNode(1);
        z.add(2);
        // z.add(3);
        // z.add(4);
        // z.add(9);
        ListNode result = new Solution().swapPairs(z);
        result.print();
    }

    public ListNode swapPairs(ListNode head) 
    {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode before = newHead;
        ListNode first = head;
        ListNode second = head.next;
        ListNode move;

        while(true)
        {
            move = second.next;
            first.next = second.next;
            second.next = first;

            before.next = second;
            before = first;

            first = move;

            if(move != null && move.next != null)
            {
                second = move.next;
                move = move.next.next;
            }
            else 
                break;
        }
        return newHead.next;
    }
}