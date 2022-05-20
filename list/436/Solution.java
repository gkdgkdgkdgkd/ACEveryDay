public class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int min = 1_000_000, max = -1_000_000;
        for (int[] p : intervals) {
            min = Math.min(min, p[0]);
            max = Math.max(max, p[1]);
        }
        int delta = -min;
        int m = max - min + 2;
        int n = intervals.length;
        int[] ret = new int[n];
        int[] next = new int[m];
        for (int i = 0; i < n; ++i) {
            next[intervals[i][0] + delta] = i + 1;
        }
        for (int i = -1; --m >= 0; next[m] = i) {
            if (next[m] > 0) {
                i = next[m] - 1;
            }
        }
        while (--n >= 0) {
            ret[n] = next[intervals[n][1] + delta];
        }
        return ret;
    }
}