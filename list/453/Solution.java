public class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int v : nums) {
            if (v < min) {
                min = v;
            }
        }
        int res = 0;
        for (int v : nums) {
            res += v - min;
        }
        return res;
    }
}