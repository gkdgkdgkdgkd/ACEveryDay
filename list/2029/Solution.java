public class Solution {
    public boolean stoneGameIX(int[] stones) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int v : stones) {
            int type = v % 3;
            if (type == 0) {
                ++c0;
            } else if (type == 1) {
                ++c1;
            } else {
                ++c2;
            }
        }
        if ((c0 & 1) == 0) {
            return c1 >= 1 && c2 >= 1;
        }
        return c1 - c2 > 2 || c2 - c1 > 2;
    }
}