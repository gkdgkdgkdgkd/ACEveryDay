import node.TreeNode;

public class Solution {
    private int res;
    private int maxHeight = 0;

    public int findBottomLeftValue(TreeNode root) {
        preorder(root, 1);
        return res;
    }

    private void preorder(TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (height > maxHeight) {
            maxHeight = height;
            res = root.val;
        }
        preorder(root.left, height + 1);
        preorder(root.right, height + 1);
    }
}