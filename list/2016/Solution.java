public class Solution {
    public int maximumDifference(int[] nums) {
        int res = -1;
        int temp = Integer.MAX_VALUE;
        for (int v : nums) {
            if (v > temp) {
                res = Math.max(res, v - temp);
            } else {
                temp = v;
            }
        }
        return res;
    }
}