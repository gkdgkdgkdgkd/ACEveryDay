import node.Node;

public class Solution {
    public Node flatten(Node head) {
        flattenChild(head);
        return head;
    }

    private Node flattenChild(Node head) {
        Node pre = head;
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            if (temp.child != null) {
                Node child = flattenChild(temp.child);
                temp.child.prev = temp;
                temp.next = temp.child;
                temp.child = null;
                child.next = next;
                if (next != null) {
                    next.prev = child;
                }
                pre = child;
                temp = next;
            } else {
                pre = temp;
                temp = temp.next;
            }
        }
        return pre;
    }
}