public class Solution {
    private static final int MOD = 1_000_000_000 + 7;

    public int countVowelPermutation(int n) {
        long[] old = new long[]{1, 1, 1, 1, 1};
        long[] res = new long[]{1, 1, 1, 1, 1};
        for (int i = 2; i <= n; i++) {
            res[0] = (old[1] + old[2] + old[4]) % MOD;
            res[1] = (old[0] + old[2]) % MOD;
            res[2] = (old[1] + old[3]) % MOD;
            res[3] = old[2];
            res[4] = (old[2] + old[3]) % MOD;
            System.arraycopy(res, 0, old, 0, 5);
        }
        return (int) ((res[0] + res[1] + res[2] + res[3] + res[4]) % MOD);
    }
}