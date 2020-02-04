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
        ListNode x = new ListNode(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(6);
        x.add(7);
        x.print();
        ListNode result = new Solution().reverseKGroup(x,scanner.nextInt());
        result.print();
    }

    public ListNode reverseKGroup(ListNode head,int k)
    {
        if(head == null || k <= 1)
            return head;
        return reverse(head,k);
    }

    public ListNode reverse(ListNode head,int k)
    {
        if(head != null)
        {
            int i=0;
            ListNode temp;
            ListNode t = head;
            ListNode dummy = new ListNode(0);
            for(;i<k && head != null;++i)
            {
                temp = head.next;
                head.next = dummy.next;
                dummy.next = head;
                head = temp;
            }
            if(i == k)
                t.next = reverse(head,k);
            else
            {
                for(head = dummy.next, dummy.next=null; head!=null;)
                {
                    temp = head.next;
                    head.next = dummy.next;
                    dummy.next = head;
                    head = temp;
                }
            }
            return dummy.next;
        }
        return null;
    }
}

