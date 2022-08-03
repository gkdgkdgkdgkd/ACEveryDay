public class Solution {
    private int max = Integer.MIN_VALUE;
    private int res = 0;

    public int maxLevelSum(TreeNode root) {
        bfs(1, 1, root);
        return res;
    }

    private void bfs(int level, int levelSize, TreeNode... nodes) {
        int sum = 0;
        TreeNode[] nextNodes = new TreeNode[levelSize << 1];
        int index = 0;
        for (int i = 0; i < levelSize; i++) {
            TreeNode node = nodes[i];
            sum += node.val;
            if (node.left != null) {
                nextNodes[index++] = node.left;
            }
            if (node.right != null) {
                nextNodes[index++] = node.right;
            }
        }
        if (max < sum) {
            max = sum;
            res = level;
        }
        if (index > 0) {
            bfs(level + 1, index, nextNodes);
        }
    }
}
