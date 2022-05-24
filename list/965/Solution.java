import node.TreeNode;

public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        int val = root.val;
        TreeNode bak = root;
        while (root != null) {
            TreeNode next = root.left;
            if (next == null) {
                root = root.right;
                continue;
            }
            while (next.right != null && next.right != root) {
                next = next.right;
            }
            if (next.right == null) {
                next.right = root;
                root = root.left;
            } else {
                next.right = null;
                if (!print(root.left, val)) {
                    return false;
                }
                root = root.right;
            }
        }
        return print(bak, val);
    }

    private boolean print(TreeNode root, int val) {
        TreeNode head = reverse(root);
        while (head != null) {
            if (head.val != val) {
                return false;
            }
            head = head.right;
        }
        reverse(root);
        return true;
    }

    private TreeNode reverse(TreeNode root) {
        TreeNode dummy = new TreeNode();
        while (root != null) {
            TreeNode next = root.right;
            root.right = dummy.right;
            dummy.right = root;
            root = next;
        }
        return dummy.right;
    }
}