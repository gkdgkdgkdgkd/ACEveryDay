public class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int total = 0;
        for (int i = 1; i < n; i++) {
            total += i * nums[i];
            sum += nums[i];
        }
        int res = total;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, total += sum - n * nums[n - i]);
        }
        return res;
    }
}