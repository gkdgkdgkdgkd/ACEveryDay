public class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        if (a == 1) {
            return 1;
        }
        a %= MOD;
        return f(a, b, b.length - 1);
    }

    private int f(int a, int[] b, int index) {
        if (index < 0) {
            return 1;
        }
        int t = pow(a, b[index]);
        return (t * pow(f(a, b, index - 1), 10)) % MOD;
    }

    private int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int val = pow(x, n >> 1);
        val *= val;
        if ((n & 1) == 1) {
            val %= MOD;
            val *= x;
        }
        return val % MOD;
    }
}