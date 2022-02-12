public class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            dfs(i, 0, m, n, grid);
            dfs(i, n - 1, m, n, grid);
        }
        for (int j = 1; j < n - 1; j++) {
            dfs(0, j, m, n, grid);
            dfs(m - 1, j, m, n, grid);
        }
        int res = 0;
        for (int[] g : grid) {
            for (int v : g) {
                res += v;
            }
        }
        return res;
    }

    private void dfs(int i, int j, int m, int n, int[][] grid) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 0;
        dfs(i - 1, j, m, n, grid);
        dfs(i + 1, j, m, n, grid);
        dfs(i, j - 1, m, n, grid);
        dfs(i, j + 1, m, n, grid);
    }
}