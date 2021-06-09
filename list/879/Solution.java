public class Solution {
    private static final int MOD = 1000000007;

    public int profitableSchemes(int maxGroup, int minProfit, int[] group, int[] profit) {
        int len = group.length;
        int[][][] dp = new int[len + 1][maxGroup + 1][minProfit + 1];
        dp[0][0][0] = 1;

        for (int i = 1; i <= len; i++) {
            int currentGroup = group[i - 1];
            int currentProfit = profit[i - 1];
            for (int j = 0; j <= maxGroup; j++) {
                for (int k = 0; k <= minProfit; ++k) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= currentGroup) {
                        dp[i][j][k] = (dp[i][j][k] + dp[i - 1][j - currentGroup][Math.max(0, k - currentProfit)]) % MOD;
                    }
                }
            }
        }

        int sum = 0;
        for (int j = 0; j <= maxGroup; j++) {
            sum = (sum + dp[len][j][minProfit]) % MOD;
        }
        return sum;
    }

}