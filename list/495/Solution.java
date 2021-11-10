public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = duration;
        int cur = timeSeries[0];
        int n = timeSeries.length;
        for (int i = 1; i < n; i++) {
            int v = timeSeries[i];
            sum += duration;
            if (cur + duration - 1 >= v) {
                sum -= (cur + duration - v);
            }
            cur = v;
        }
        return sum;
    }
}