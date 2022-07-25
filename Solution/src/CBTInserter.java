import node.TreeNode;

import java.util.LinkedList;

public class CBTInserter {
    private final LinkedList<TreeNode> queue = new LinkedList<>();
    private final TreeNode root;

    public CBTInserter(TreeNode root) {
        this.root = root;
        LinkedList<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.addLast(root);
        while (!q.isEmpty()) {
            TreeNode front = q.pollFirst();
            if (front.left != null) {
                q.addLast(front.left);
            } else {
                queue.addLast(front);
                continue;
            }
            if (front.right != null) {
                q.addLast(front.right);
            } else {
                queue.addLast(front);
            }
        }
    }

    public int insert(int val) {
        TreeNode front = queue.peekFirst();
        TreeNode newNode = new TreeNode(val);
        if (front.left == null) {
            front.left = newNode;
        } else {
            front.right = newNode;
            queue.pollFirst();
        }
        queue.addLast(newNode);
        return front.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
