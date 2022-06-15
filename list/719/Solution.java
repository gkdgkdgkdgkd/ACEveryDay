import java.util.Arrays;

public class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = 1_000_000;
        while (l < r) {
            int m = l + r >> 1;
            if (check(nums, m) >= k) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    private int check(int[] nums, int x) {
        int n = nums.length;
        int res = 0;
        for (int i = 0, j = 1; i < n; i++) {
            while (j < n && nums[j] - nums[i] <= x) {
                ++j;
            }
            res += j - i - 1;
        }
        return res;
    }
}