public class Solution {
    private int m;
    private int n;
    private int[][][] cache;
    private static final int mod = 1_000_000_007;
    private final int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        this.m = m;
        this.n = n;
        this.cache = new int[m][n][maxMove+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= maxMove; k++) {
                    cache[i][j][k] = -1;
                }
            }
        }
        return dfs(startRow, startColumn, maxMove);
    }

    private int dfs(int i, int j, int k) {
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 1;
        }
        if (k == 0) {
            return 0;
        }
        if (cache[i][j][k] != -1) {
            return cache[i][j][k];
        }
        int ans = 0;
        for (int[] d : dirs) {
            int x = i + d[0];
            int y = j + d[1];
            ans += dfs(x, y, k - 1);
            ans %= mod;
        }
        return cache[i][j][k] = ans;
    }
}