import node.TreeNode;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        TreeNode[] queue = new TreeNode[100_001];
        int front = 0;
        int tail = 0;
        queue[tail++] = root;
        boolean odd = true;
        while (front < tail) {
            int size = tail - front;
            int lastVal = -1;
            if (odd) {
                for (int i = 0; i < size; i++) {
                    TreeNode top = queue[front++];
                    if ((top.val & 1) == 0) {
                        return false;
                    }
                    if (lastVal != -1 && lastVal >= top.val) {
                        return false;
                    }
                    lastVal = top.val;
                    if (top.left != null) {
                        queue[tail++] = top.left;
                    }
                    if (top.right != null) {
                        queue[tail++] = top.right;
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode top = queue[front++];
                    if ((top.val & 1) == 1) {
                        return false;
                    }
                    if (lastVal != -1 && lastVal <= top.val) {
                        return false;
                    }
                    lastVal = top.val;
                    if (top.left != null) {
                        queue[tail++] = top.left;
                    }
                    if (top.right != null) {
                        queue[tail++] = top.right;
                    }
                }
            }
            odd = !odd;
        }
        return true;
    }
}