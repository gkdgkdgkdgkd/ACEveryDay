public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int r = n - 1;
        int l = 0;
        while (l < r) {
            int m = (l + r) >> 1;
            int v = nums[m];
            if (nums[m - 1] != v && nums[m + 1] != v) {
                return v;
            }
            if (nums[m - 1] == v) {
                if (((m - l) & 1) == 1) {
                    l = m + 1;
                } else {
                    r = m;
                }
            } else {
                if (((r - m) & 1) == 1) {
                    r = m - 1;
                } else {
                    l = m;
                }
            }
        }
        return nums[l];
    }
}