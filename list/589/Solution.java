import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Node[] stack = new Node[10_001];
        int index = 0;
        stack[index++] = root;
        while (index > 0) {
            Node top = stack[--index];
            res.add(top.val);
            for (int i = top.children.size() - 1; i >= 0; --i) {
                stack[index++] = top.children.get(i);
            }
        }
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