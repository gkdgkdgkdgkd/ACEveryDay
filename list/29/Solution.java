public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == 0) {
            return 0;
        }
        if (dividend == divisor) {
            return 1;
        }
        if (divisor == -1) {
            return dividend > Integer.MIN_VALUE ? -dividend : Integer.MAX_VALUE;
        }
        boolean negative = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long res = div(a, b);
        if(negative){
            return res <= Integer.MIN_VALUE ? Integer.MAX_VALUE : (int)(-res);
        }
        return res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;
    }

    private static long div(long a, long b) {
        if (a < b) {
            return 0;
        }
        long res = 1;
        long tb = b;
        while ((tb << 1) <= a) {
            res <<= 1;
            tb <<= 1;
        }
        return res + div(a - tb, b);
    }
}