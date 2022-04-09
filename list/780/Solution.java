public class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (sx < tx && sy < ty) {
            if (tx < ty) {
                ty %= tx;
            } else {
                tx %= ty;
            }
        }
        if (tx < sx || ty < sy) {
            return false;
        }
        return tx == sx ? (ty - sy) % tx == 0 : (tx - sx) % ty == 0;
    }
}