public class Solution {

    private int minId = Integer.MAX_VALUE;
    private int k;
    private int len;

    public int minimumTimeRequired(int[] jobs, int k) {
        len = jobs.length;
        fd(jobs, new int[this.k = k], 0, 0);
        return minId;
    }

    private void fd(int[] jobs, int[] times, int m, int minTime) {
        if (m == len) {
            minId = Math.min(minTime, minId);
            return;
        }
        boolean first = true;
        for (int i = 0; i < k; i++) {
            if (times[i] == 0 && !first) {
                return;
            }
            if (times[i] == 0) {
                first = false;
            }
            times[i] += jobs[m];
            int tmpMax = Math.max(minTime, times[i]);
            if (tmpMax < minId) {
                fd(jobs, times, m + 1, Math.max(minTime, times[i]));
            }
            times[i] -= jobs[m];
        }
    }
}