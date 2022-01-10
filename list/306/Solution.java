public class Solution {
    private int n;
    private char[] c;

    public boolean isAdditiveNumber(String num) {
        c = num.toCharArray();
        n = c.length;
        if (n <= 2) {
            return false;
        }
        return dfs(-1, -1, 0);
    }

    private boolean dfs(long pre1, long pre2, int index) {
        long sum = 0;
        for (int i = index; i < n; i++) {
            if (i != index && sum == 0) {
                return false;
            }
            sum *= 10;
            sum += (c[i] - '0');
            if (pre1 == -1) {
                if (dfs(pre2, sum, i + 1)) {
                    return true;
                }
            } else if (pre1 + pre2 == sum) {
                if (i + 1 == n || dfs(pre2, sum, i + 1)) {
                    return true;
                }
            } else if (pre1 + pre2 < sum) {
                return false;
            }
        }
        return false;
    }
}