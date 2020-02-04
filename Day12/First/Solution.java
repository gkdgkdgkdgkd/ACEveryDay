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
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        while(true)
        {
            ListNode nextTPosition = head;
            ListNode temp;
            int i=0;
            for(;i<k && head != null;++i)
            {
                temp = head.next;
                head.next = t.next;
                t.next = head;
                head = temp;
            }
            if(i == k)
                t = nextTPosition;
            else
            {
                for(head = t.next,t.next=null;head!=null;)
                {
                    temp = head.next;
                    head.next = t.next;
                    t.next = head;
                    head = temp;
                }
                break;
            }
        }
        return dummy.next;
    }
}

