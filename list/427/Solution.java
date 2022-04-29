public class Solution {
    private int[][] sum;

    public Node construct(int[][] grid) {
        int n = grid.length;
        sum = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + grid[i - 1][j - 1];
            }
        }
        return dfs(grid, 0, 0, n - 1, n - 1);
    }

    private Node dfs(int[][] grid, int x1, int y1, int x2, int y2) {
        Node node = new Node();
        int tempSum = sum[x2 + 1][y2 + 1] - sum[x1][y2 + 1] - sum[x2 + 1][y1] + sum[x1][y1];
        if (tempSum == 0 || tempSum == (x2 - x1 + 1) * (y2 - y1 + 1)) {
            node.isLeaf = true;
            node.val = grid[x1][y1] == 1;
        } else {
            node.isLeaf = false;
            int halfX = x1 + ((x2 - x1) >> 1);
            int halfY = y1 + ((y2 - y1) >> 1);
            node.topLeft = dfs(grid, x1, y1, halfX, halfY);
            node.topRight = dfs(grid, x1, halfY + 1, halfX, y2);
            node.bottomLeft = dfs(grid, halfX + 1, y1, x2, halfY);
            node.bottomRight = dfs(grid, halfX + 1, halfY + 1, x2, y2);
        }
        return node;
    }

    private static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
}