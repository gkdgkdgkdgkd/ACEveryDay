import node.TreeNode;

public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return preorder(root, 0) >> 1;
    }

    private int preorder(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        val = (val << 1) + root.val;
        return root.left != null || root.right != null ? preorder(root.left, val) + preorder(root.right, val) : val;
    }
}