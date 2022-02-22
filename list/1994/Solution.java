public class Solution {
    private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    private static final int MOD = 1000000007;

    public int numberOfGoodSubsets(int[] nums) {
        int[] freq = new int[31];
        for (int num : nums) {
            ++freq[num];
        }

        int[] f = new int[1 << PRIMES.length];
        f[0] = 1;
        for (int i = 0; i < freq[1]; ++i) {
            f[0] = f[0] * 2 % MOD;
        }

        for (int i = 2; i <= 30; ++i) {
            if (freq[i] == 0) {
                continue;
            }
            int subset = 0;
            boolean check = true;
            for (int j = 0; j < PRIMES.length; ++j) {
                int prime = PRIMES[j];
                if (i % (prime * prime) == 0) {
                    check = false;
                    break;
                }
                if (i % prime == 0) {
                    subset |= (1 << j);
                }
            }
            if (!check) {
                continue;
            }
            for (int mask = (1 << PRIMES.length) - 1; mask > 0; --mask) {
                if ((mask & subset) == subset) {
                    f[mask] = (int) ((f[mask] + ((long) f[mask ^ subset]) * freq[i]) % MOD);
                }
            }
        }

        int ans = 0;
        for (int mask = 1, maskMax = (1 << PRIMES.length); mask < maskMax; ++mask) {
            ans = (ans + f[mask]) % MOD;
        }

        return ans;
    }
}