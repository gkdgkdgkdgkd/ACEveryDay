public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        dp[0] = count[0] = 1;
        int maxLen = 1;
        int res = 1;
        for (int i = 1; i < n; i++) {
            int v = nums[i];
            for (int j = 0; j < i; j++) {
                if (v > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
            }
            if (dp[i] == 0) {
                dp[i] = 1;
                count[i] = 1;
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                res = count[i];
            } else if (dp[i] == maxLen) {
                res += count[i];
            }
        }
        return res;
    }
}