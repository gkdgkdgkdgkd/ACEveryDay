public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < target || ((sum + target) & 1) == 1) {
            return 0;
        }
        int bagSize = (sum+target) >> 1;
        int n = nums.length;
        int[] dp = new int[bagSize+1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            for (int j = bagSize; j >= num; --j) {
                dp[j] += dp[j-num];
            }
        }

        return dp[bagSize];
    }
}