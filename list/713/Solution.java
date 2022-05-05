public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int cur = 1;
        int l = 0;
        int r = 0;
        int res = 0;
        for (int n = nums.length; r < n; ++r) {
            cur *= nums[r];
            while (cur >= k) {
                cur /= nums[l++];
            }
            res += r - l + 1;
        }
        return res;
    }
}