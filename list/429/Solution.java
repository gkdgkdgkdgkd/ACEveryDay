import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root != null) {
            dfs(root, 0);
        }
        return res;
    }

    private void dfs(Node root, int level) {
        if (level >= res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        for (Node node : root.children) {
            dfs(node, level + 1);
        }
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