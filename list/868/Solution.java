public class Solution {
    public int binaryGap(int n) {
        int res = 0;
        for (int last = 0; n > 0; n >>= 1) {
            if ((n & 1) == 1) {
                res = Math.max(res, last);
                last = 1;
            } else if (last > 0) {
                ++last;
            }
        }
        return res;
    }
}