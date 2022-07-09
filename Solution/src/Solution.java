public class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int res = 0;
        for (int i = 2; i < n; i++) {
            int l = 0;
            int r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] == arr[i]) {
                    res = Math.max(res, dp[r][i] = dp[l][r] + 1);
                    ++l;
                    --r;
                } else if (arr[l] + arr[r] > arr[i]) {
                    --r;
                } else {
                    ++l;
                }
            }
        }
        return res == 0 ? 0 : res + 2;
    }
}