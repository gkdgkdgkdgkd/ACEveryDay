public class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int l = 0, r = 2; r < n; ++r) {
            int d = nums[r] - nums[r - 1];
            if (d != nums[r - 1] - nums[l]) {
                ++l;
                continue;
            }
            while (++r < n && nums[r] - nums[r - 1] == d) {
            }
            res += ((r - l - 2) * (r - l - 1)) >> 1;
            l = r - 1;
        }
        return res;
    }
}