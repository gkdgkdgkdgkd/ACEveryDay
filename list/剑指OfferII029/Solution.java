import node.Node;

public class Solution {
    public Node insert(Node head, int insertVal) {
        Node insertNode = new Node(insertVal);
        if (head == null) {
            insertNode.next = insertNode;
            return insertNode;
        }
        if (head.next == head) {
            head.next = insertNode;
            insertNode.next = head;
            return head;
        }
        Node curr = head;
        Node next = head.next;
        while (next != head) {
            if (
                (insertVal >= curr.val && insertVal <= next.val)
                ||
                ((curr.val > next.val && (insertVal > curr.val || insertVal < next.val)))
            ) {
                break;
            }
            curr = curr.next;
            next = next.next;
        }
        curr.next = insertNode;
        insertNode.next = next;
        return head;
    }
}