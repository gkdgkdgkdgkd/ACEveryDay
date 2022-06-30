public class Solution {
    private static final int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private static final boolean[] isPrime = new boolean[101];

    static {
        for (int v : prime) {
            isPrime[v] = true;
        }
    }

    public int numPrimeArrangements(int n) {
        int primeCount = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime[i]) {
                ++primeCount;
            }
        }
        long sum = 1;
        for (int i = 1; i <= primeCount; i++) {
            sum *= i;
            sum %= 1_000_000_007L;
        }

        for (int i = 1; i <= n - primeCount; i++) {
            sum *= i;
            sum %= 1_000_000_007L;
        }
        return (int) sum;
    }
}