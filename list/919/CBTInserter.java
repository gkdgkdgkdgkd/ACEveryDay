import node.TreeNode;

public class CBTInserter {
    private final TreeNode[] queue = new TreeNode[10_001];
    private int front = 0;
    private int tail = 0;
    private final TreeNode root;

    public CBTInserter(TreeNode root) {
        this.root = root;
        TreeNode[] q = new TreeNode[1001];
        int qFront = 0;
        int qTail = 0;
        if (root == null) {
            return;
        }
        q[qTail++] = root;
        while (qFront < qTail) {
            TreeNode frontNode = q[qFront++];
            if (frontNode.left != null) {
                q[qTail++] = frontNode.left;
            } else {
                queue[tail++] = frontNode;
                continue;
            }
            if (frontNode.right != null) {
                q[qTail++] = frontNode.right;
            } else {
                queue[tail++] = frontNode;
            }
        }
    }

    public int insert(int val) {
        TreeNode frontNode = queue[front];
        TreeNode newNode = new TreeNode(val);
        if (frontNode.left == null) {
            frontNode.left = newNode;
        } else {
            frontNode.right = newNode;
            ++front;
        }
        queue[tail++] = newNode;
        return frontNode.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
