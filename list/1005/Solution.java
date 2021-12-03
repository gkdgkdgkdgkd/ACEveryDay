public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] count = new int[101];
        int sum = 0;
        int minAbs = Integer.MAX_VALUE;
        for (int v : nums) {
            sum += v;
            minAbs = Math.min(minAbs, Math.abs(v));
            if (v <= 0) {
                ++count[v + 100];
            }
        }
        for (int i = 0; i < 100 && k > 0; i++) {
            if (count[i] > 0) {
                sum += Math.min(count[i], k) * (100 - i) * 2;
                k = Math.max(0, k - count[i]);
            }
        }
        return sum - (count[100] > 0 || (k & 1) == 0 ? 0 : minAbs << 1);
    }
}