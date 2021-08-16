public class Solution {
    private int res = 0;

    public int countArrangement(int n) {
        for (int i = 1; i <= n; i++) {
            dfs(i, 0, n);
        }
        return res;
    }

    private void dfs(int i, int mask, int n) {
        if (i > n) {
            if (mask + 1 == (1 << n)) {
                ++res;
            }
            return;
        }
        for (int j = 1; j <= n; j++) {
            if (((mask >> (j - 1)) & 1) == 0) {
                if (j % i == 0 || i % j == 0) {
                    int temp = mask;
                    mask = (1 << (j - 1)) | mask;
                    dfs(i + 1, mask, n);
                    mask = temp;
                }
            }
        }
    }
}