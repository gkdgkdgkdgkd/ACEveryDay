public class Solution {
    public int maxFrequency(int[] nums, int k) {
        int[] count = new int[100_000 + 1];
        int n = nums.length;
        int max = 0;
        for (int v : nums) {
            ++count[v];
            if (v > max) {
                max = v;
            }
        }

        int index = 0;
        for (int i = 1; i <= max; i++) {
            int c = count[i];
            for (int j = 0; j < c; j++) {
                nums[index++] = i;
            }
            if (index >= n) {
                break;
            }
        }

        int res = 0;
        for (int r = 1, l = 0, total = 0; r < n; r++) {
            total += (nums[r] - nums[r - 1]) * (r - l);
            while (total > k) {
                total -= (nums[r] - nums[l]);
                ++l;
            }
            res = Math.max(res, r - l);
        }
        return res + 1;
    }
}