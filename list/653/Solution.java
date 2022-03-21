import node.TreeNode;

public class Solution {
    private static final int SHIFT = 20_000;

    public boolean findTarget(TreeNode root, int k) {
        return k <= 20_000 && k >= -20_000 && dfs(root, k, new boolean[40_001]);
    }

    private boolean dfs(TreeNode root, int k, boolean[] set) {
        if (root == null) {
            return false;
        }
        if (set[k - root.val + SHIFT]) {
            return true;
        }
        set[root.val + SHIFT] = true;
        return dfs(root.left, k, set) || dfs(root.right, k, set);
    }
}