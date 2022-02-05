public class Solution {
    private int m;
    private int n;
    private final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int getMaximumGold(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    int conns = 0;
                    if (i > 0 && grid[i - 1][j] != 0) {
                        ++conns;
                    }
                    if (j > 0 && grid[i][j - 1] != 0) {
                        ++conns;
                    }
                    if (i + 1 < m && grid[i + 1][j] != 0) {
                        ++conns;
                    }
                    if (j + 1 < n && grid[i][j + 1] != 0) {
                        ++conns;
                    }
                    if (conns <= 2) {
                        res = Math.max(res, dfs(i, j, grid));
                    }
                }
            }
        }
        return res;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i == m || j < 0 || j == n || grid[i][j] == 0) {
            return 0;
        }
        int temp = grid[i][j];
        int max = grid[i][j] = 0;
        for (int[] dir : dirs) {
            max = Math.max(dfs(i + dir[0], j + dir[1], grid), max);
        }
        grid[i][j] = temp;
        return max + temp;
    }
}