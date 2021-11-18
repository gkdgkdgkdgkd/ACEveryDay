import node.TreeNode;

public class Solution {
    private int res = 0;

    public int findTilt(TreeNode root) {
        postorder(root);
        return res;
    }

    private int postorder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = postorder(root.left);
        int r = postorder(root.right);
        res += Math.abs(l - r);
        return l + r + root.val;
    }
}