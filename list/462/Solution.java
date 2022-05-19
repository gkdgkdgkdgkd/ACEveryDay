import java.util.Arrays;

public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int target = nums[n >> 1];
        if ((n & 1) == 0) {
            target += nums[(n >> 1) - 1];
            target >>= 1;
        }
        int res = 0;
        for (int v : nums) {
            res += Math.abs(v - target);
        }
        return res;
    }
}