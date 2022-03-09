public class Solution {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            diffs[(i - (nums[i] - 1) + n) % n] -= 1;
            diffs[(i + 1 + n) % n] += 1;
        }
        int res = 0;
        int max = diffs[0];
        int score = 0;
        for (int i = 0; i < n; i++) {
            score += diffs[i];
            if (score > max) {
                res = i;
                max = score;
            }
        }
        return res;
    }
}