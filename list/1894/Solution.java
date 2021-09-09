public class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        if (n == 1 || chalk[0] > k) {
            return 0;
        }
        int[] sum = new int[n];
        sum[0] = chalk[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + chalk[i];
            if (sum[i] > k) {
                return i;
            }
        }
        k %= sum[n - 1];
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (sum[m] == k) {
                return m == n - 1 ? 0 : m + 1;
            }
            if (sum[m] > k) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return sum[l] > k ? l : (l + 1 < n ? l + 1 : 0);
    }
}