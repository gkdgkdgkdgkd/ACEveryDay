public class Solution {
    private static final int MOD = 1_000_000_007;

    public int numDecodings(String s) {
        char[] c = s.toCharArray();
        if (c[0] == '0') {
            return 0;
        }
        int n = s.length();
        long dp1 = 0;
        long dp2 = 1;
        long dp3 = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == '0') {
                dp3 = 0;
            } else {
                dp3 = dp2;
                if (c[i] == '*') {
                    dp3 *= 9;
                }
            }
            if (i > 0) {
                if (c[i - 1] == '*') {
                    if (c[i] == '*') {
                        dp3 += dp1 * 15;
                    } else if (c[i] <= '6') {
                        dp3 += (dp1 << 1);
                    } else {
                        dp3 += dp1;
                    }
                } else if (c[i] == '*') {
                    if (c[i - 1] == '1') {
                        dp3 += dp1 * 9;
                    } else if (c[i - 1] == '2') {
                        dp3 += dp1 * 6;
                    }
                } else if (c[i - 1] != '0' && (c[i - 1] - '0') * 10 + (c[i] - '0') <= 26) {
                    dp3 += dp1;
                }
            }
            dp3 %= MOD;
            dp1 = dp2;
            dp2 = dp3;
        }
        return (int) dp3;
    }
}