import java.util.Random;

public class Solution {
    private static final Random random = new Random();
    private final int[] sum;
    private final int n;
    private final int max;

    public Solution(int[] w) {
        int n = w.length;
        int[] sum = new int[n];
        sum[0] = w[0];
        for (int i = 1; i < n; ++i) {
            sum[i] = w[i] + sum[i - 1];
        }
        this.n = n;
        this.sum = sum;
        this.max = sum[n - 1];
    }

    public int pickIndex() {
        int target = random.nextInt(max);
        int[] sum = this.sum;
        int n = this.n;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (target >= sum[m]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}