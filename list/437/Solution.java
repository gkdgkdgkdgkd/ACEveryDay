import node.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Integer, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        map.put(0, 1);
        return preorder(root, 0, targetSum);
    }

    private int preorder(TreeNode root, int cur, int target) {
        if (root == null) {
            return 0;
        }
        cur += root.val;
        int res = map.getOrDefault(cur - target, 0);
        map.put(cur, map.getOrDefault(cur, 0) + 1);
        res += preorder(root.left, cur, target);
        res += preorder(root.right, cur, target);
        map.put(cur, map.get(cur) - 1);
        return res;
    }
}