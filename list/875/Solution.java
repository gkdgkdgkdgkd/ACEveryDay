public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1_000_000_000;
        int res = r;
        while (l <= r) {
            int m = (l + r) >> 1;
            int count = 0;
            for (int v : piles) {
                count += v / m + (v % m == 0 ? 0 : 1);
            }
            if (count > h) {
                l = m + 1;
            } else {
                res = Math.min(res, m);
                r = m - 1;
            }
        }
        return res;
    }
}