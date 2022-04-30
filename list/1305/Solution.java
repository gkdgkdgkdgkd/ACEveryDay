import node.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int front = 0;
    private int tail = 0;
    private final int[] queue = new int[5001];

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        inorder(root1);
        inorder(root2, res);
        while (front < tail) {
            res.add(queue[front++]);
        }
        return res;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        queue[tail++] = root.val;
        inorder(root.right);
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        while (front < tail && root.val > queue[front]) {
            res.add(queue[front++]);
        }
        res.add(root.val);
        inorder(root.right, res);
    }
}