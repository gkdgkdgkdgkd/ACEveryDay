import java.util.Arrays;

public class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int last = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0, n = nums.length; i < n; i++) {
            if (nums[i] == last) {
                continue;
            }
            last = nums[i];
            if (find(nums, nums[i] + k, i + 1, n - 1)) {
                ++res;
            }
        }
        return res;
    }

    public boolean find(int[] nums, int v, int l, int r) {
        while (l <= r) {
            int m = (l + r) >> 1;
            if (nums[m] == v) {
                return true;
            }
            if (nums[m] < v) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}