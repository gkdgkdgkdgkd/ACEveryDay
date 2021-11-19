public class Solution {
    public int integerReplacement(int n) {
        int res = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>= 1;
                ++res;
            } else if (n % 4 == 1) {
                res += 2;
                n >>= 1;
            } else {
                if (n != 3) {
                    n = (n >> 1) + 1;
                } else {
                    n = 1;
                }
                res += 2;
            }
        }
        return res;
    }
}