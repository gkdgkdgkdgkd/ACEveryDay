public class Solution {
    private static final int MOD = 1_000_000_007;

    public int countPalindromicSubsequences(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int[][][] dp = new int[4][n][n];
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    char c = (char) ('a' + k);
                    if (i == j) {
                        dp[k][i][j] = (str[i] == c ? 1 : 0);
                    } else {
                        if (str[i] != c) {
                            dp[k][i][j] = dp[k][i + 1][j];
                        } else if (str[j] != c) {
                            dp[k][i][j] = dp[k][i][j - 1];
                        } else {
                            dp[k][i][j] = 2;
                            if (j > i + 1) {
                                for (int l = 0; l < 4; l++) {
                                    dp[k][i][j] += dp[l][i + 1][j - 1];
                                    dp[k][i][j] %= MOD;
                                }
                            }
                        }
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 4; i++) {
            res += dp[i][0][n - 1];
            res %= MOD;
        }
        return res;
    }
}