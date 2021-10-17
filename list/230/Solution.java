import node.TreeNode;

public class Solution {
    private int k;
    private int res;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inorder(root);
        return res;
    }

    private void inorder(TreeNode root) {
        if (root == null || k < 0) {
            return;
        }
        inorder(root.left);
        if (--k == 0) {
            res = root.val;
        }
        inorder(root.right);
    }
}