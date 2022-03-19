import node.TreeNode;

public class Solution {
    private final StringBuilder builder = new StringBuilder();

    public String tree2str(TreeNode root) {
        preorder(root);
        return builder.toString();
    }

    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        builder.append(root.val);
        if (root.left != null) {
            builder.append("(");
            preorder(root.left);
            builder.append(")");
        }
        if (root.right != null) {
            if (root.left == null) {
                builder.append("()");
            }
            builder.append("(");
            preorder(root.right);
            builder.append(")");
        }
    }
}