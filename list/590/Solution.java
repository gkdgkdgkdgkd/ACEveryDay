import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        Node[] queue = new Node[10_001];
        if (root == null) {
            return res;
        }
        int tail = 0;
        queue[tail++] = root;
        while (tail > 0) {
            Node top = queue[--tail];
            for (Node node : top.children) {
                queue[tail++] = node;
            }
            res.add(top.val);
        }
        Collections.reverse(res);
        return res;
    }

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}