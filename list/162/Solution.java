public class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (m == 0) {
                if (nums[m] > nums[m + 1]) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (m == n - 1) {
                if (nums[m] > nums[m - 1]) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (nums[m] > nums[m - 1] && nums[m] > nums[m + 1]) {
                return m;
            } else if (nums[m] > nums[m - 1] && nums[m] < nums[m + 1]) {
                l = m + 1;
            } else if (nums[m] < nums[m - 1] && nums[m] > nums[m + 1]) {
                r = m - 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }
}