import java.util.LinkedList;
import java.util.List;

public class Solution {
    private final TreeNode[] map = new TreeNode[501];
    private final boolean[] visit = new boolean[501];
    private final List<Integer> res = new LinkedList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root);
        bfs(target, k);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root.left != null) {
            map[root.left.val] = root;
            dfs(root.left);
        }
        if (root.right != null) {
            map[root.right.val] = root;
            dfs(root.right);
        }
    }

    private void bfs(TreeNode root, int k) {
        visit[root.val] = true;
        if (k == 0) {
            res.add(root.val);
            return;
        }
        if (root.left != null && !visit[root.left.val]) {
            bfs(root.left, k - 1);
        }
        if (root.right != null && !visit[root.right.val]) {
            bfs(root.right, k - 1);
        }
        TreeNode parent = map[root.val];
        if (parent != null && !visit[parent.val]) {
            bfs(parent, k - 1);
        }
    }
}