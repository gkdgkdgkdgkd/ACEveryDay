import java.util.Arrays;

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = k - 1, n = nums.length; i < n; i++) {
            res = Math.min(nums[i] - nums[i - k + 1], res);
        }
        return res;
    }
}