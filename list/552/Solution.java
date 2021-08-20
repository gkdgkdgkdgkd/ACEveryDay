public class Solution {
    public int checkRecord(int n) {
        final long MOD = 1_000_000_007;
        long a = 1;
        long b = 0;
        long c = 0;
        long x = 0;
        long y = 0;
        long z = 0;
        for (int i = 0; i < n; i++) {
            long aa = (a + b + c) % MOD;
            long xx = (a + b + c + x + y + z) % MOD;

            c = b;
            b = a;
            a = aa;

            z = y;
            y = x;
            x = xx;
        }
        return (int) ((a + b + c + x + y + z) % MOD);
    }
}