public class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[] res = new int[3];
        int sum1 = 0;
        int maxSum1 = 0;
        int sum1Index = 0;
        int sum2 = 0;
        int maxSum2 = 0;
        int sum2Index1 = 0;
        int sum2Index2 = 0;
        int sum3 = 0;
        int maxSum3 = 0;
        int n = nums.length;
        for (int i = (k << 1); i < n; i++) {
            sum1 += nums[i - (k << 1)];
            sum2 += nums[i - k];
            sum3 += nums[i];
            if (i >= k * 3 - 1) {
                if (sum1 > maxSum1) {
                    maxSum1 = sum1;
                    sum1Index = i - k * 3 + 1;
                }
                if (maxSum1 + sum2 > maxSum2) {
                    maxSum2 = sum2 + maxSum1;
                    sum2Index1 = sum1Index;
                    sum2Index2 = i - k * 2 + 1;
                }
                if (maxSum2 + sum3 > maxSum3) {
                    maxSum3 = maxSum2 + sum3;
                    res[0] = sum2Index1;
                    res[1] = sum2Index2;
                    res[2] = i - k + 1;
                }
                sum1 -= nums[i - k * 3 + 1];
                sum2 -= nums[i - k * 2 + 1];
                sum3 -= nums[i - k + 1];
            }
        }
        return res;
    }
}