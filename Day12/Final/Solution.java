import java.util.Scanner;
import java.util.Stack;

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
        Scanner scanner = new Scanner(System.in);
        ListNode x = new ListNode(4);
        x.add(4);
        x.add(9);
        x.add(88);
        x.add(133);
        x.add(1999);
        x.add(99999);
        ListNode result = new Solution().reverseKGroup(x,scanner.nextInt());
        result.print();
    }

    public ListNode reverseKGroup(ListNode head,int k)
    {
        if(head == null || k <= 1)
            return head;
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        while(true)
        {
            Stack<ListNode> s = new Stack<>();
            ListNode temp = head;
            int i=0;
            for(;i<k && head != null;++i)
            {
                s.add(new ListNode(head.val));
                head = head.next;
            }
            if(i == k)
            {
                for(i=0;i<k;++i)
                {
                    t.next = s.pop();
                    t = t.next;
                }
            }
            else if(head == null)
            {
                t.next = temp;
                break;
            }
        }
        return dummy.next;
    }
}

