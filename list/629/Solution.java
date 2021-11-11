public class Solution {
    public int kInversePairs(int n, int k) {
        int mod = 1_000_000_007;
        long[][] f = new long[n + 1][k + 1];
        f[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            long sum = 0;
            for (int j = 0; j <= k; j++) {
                sum += f[i - 1][j];
                if (j + 1 > i) {
                    sum -= f[i - 1][j - i];
                }
                f[i][j] = sum % mod;
            }
        }
        return (int) (f[n][k] % mod);
    }
}