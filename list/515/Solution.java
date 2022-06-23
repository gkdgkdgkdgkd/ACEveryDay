import node.TreeNode;

import java.util.*;

public class Solution {
    private final List<Integer> res = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        bfs(root, 1);
        return res;
    }

    private void bfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level > res.size()) {
            res.add(root.val);
        } else if (root.val > res.get(level - 1)) {
            res.set(level - 1, root.val);
        }
        bfs(root.left, level + 1);
        bfs(root.right, level + 1);
    }
}