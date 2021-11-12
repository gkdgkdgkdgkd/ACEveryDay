public class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int l = n - 1; l >= 1; --l) {
            for (int r = l + 1; r <= n; r++) {
                int min = Integer.MAX_VALUE;
                for (int x = l; x < r; x++) {
                    min = Math.min(min, Math.max(dp[l][x - 1], dp[x + 1][r]) + x);
                }
                dp[l][r] = min;
            }
        }
        return dp[1][n];
    }
}