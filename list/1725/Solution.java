public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int res = 0;
        for (int[] rec : rectangles) {
            int min = Math.min(rec[0], rec[1]);
            if (min > max) {
                max = min;
                res = 1;
            } else if (min == max) {
                ++res;
            }
        }
        return res;
    }
}