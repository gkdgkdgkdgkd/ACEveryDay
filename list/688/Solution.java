import java.util.Arrays;

public class Solution {
    private double[][][] cache;
    private static final int[][] dirs = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, -2}, {2, -1}, {1, 2}, {2, 1}};

    public double knightProbability(int n, int k, int row, int column) {
        cache = new double[n][n][k + 1];
        for (double[][] d : cache) {
            for (double[] arr : d) {
                Arrays.fill(arr, -1.0);
            }
        }
        return dfs(row, column, n, k);
    }

    private double dfs(int x, int y, int n, int k) {
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return 0.0;
        }
        if (k == 0) {
            return 1.0;
        }
        if (cache[x][y][k] > 0) {
            return cache[x][y][k];
        }
        double res = 0.0;
        for (int[] dir : dirs) {
            res += 0.125 * dfs(x + dir[0], y + dir[1], n, k - 1);
        }
        return cache[x][y][k] = res;
    }
}