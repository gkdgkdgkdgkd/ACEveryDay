public class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1;
        int r = m * n;
        while (l < r) {
            int x = l + ((r - l) >> 1);
            int count = (x / n) * n;
            for (int i = x / n + 1; i <= m; i++) {
                count += x / i;
            }
            if (count >= k) {
                r = x;
            } else {
                l = x + 1;
            }
        }
        return l;
    }
}