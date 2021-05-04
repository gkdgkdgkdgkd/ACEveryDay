public class Solution {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int[][][] dp = new int[m][target + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= target; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = 0x3f3f3f3f;
                }
            }
        }

        if (houses[0] == 0) {
            System.arraycopy(cost[0], 0, dp[0][1], 1, n);
        } else {
            dp[0][1][houses[0]] = 0;
        }

        for (int i = 1; i < m; i++) {
            if (houses[i] == 0) {
                for (int curColor = 1; curColor <= n; ++curColor) {
                    for (int preColor = 1; preColor <= n; ++preColor) {
                        for (int j = 1; j <= target; j++) {
                            dp[i][j][curColor] = (curColor == preColor ?
                                    Math.min(dp[i][j][curColor], dp[i - 1][j][curColor] + cost[i][curColor - 1]) :
                                    Math.min(dp[i][j][curColor], dp[i - 1][j - 1][preColor] + cost[i][curColor - 1])
                            );
                        }
                    }
                }
            } else {
                int curColor = houses[i];
                for (int preColor = 1; preColor <= n; ++preColor) {
                    for (int j = 1; j <= target; j++) {
                        dp[i][j][curColor] = (curColor == preColor ?
                                Math.min(dp[i][j][curColor], dp[i - 1][j][curColor]) :
                                Math.min(dp[i][j][curColor], dp[i - 1][j - 1][preColor])
                        );
                    }
                }
            }
        }

        int min = dp[m - 1][target][1];
        for (int i = 2; i <= n; i++) {
            if (min > dp[m - 1][target][i]) {
                min = dp[m - 1][target][i];
            }
        }
        return min == 0x3f3f3f3f ? -1 : min;
    }
}