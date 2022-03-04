public class Solution {
    public long subArrayRanges(int[] nums) {
        long res = 0;
        for (int i = 0, n = nums.length, l, r; i < n; i++) {
            l = r = i;
            int v = nums[i];
            while (l - 1 >= 0 && nums[l - 1] < v) {
                --l;
            }
            while (r + 1 < n && nums[r + 1] <= v) {
                ++r;
            }
            res += (long) (r - i + 1) * (i - l + 1) * v;

            l = r = i;
            while (l - 1 >= 0 && nums[l - 1] > v) {
                --l;
            }
            while (r + 1 < n && nums[r + 1] >= v) {
                ++r;
            }
            res -= (long) (r - i + 1) * (i - l + 1) * v;
        }
        return res;
    }
}