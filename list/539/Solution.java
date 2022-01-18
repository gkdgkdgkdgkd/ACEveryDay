import java.util.Arrays;
import java.util.List;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if (n > 1440) {
            return 0;
        }
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            int hour = (timePoints.get(i).charAt(0) - '0') * 10 + (timePoints.get(i).charAt(1) - '0');
            int minute = (timePoints.get(i).charAt(3) - '0') * 10 + (timePoints.get(i).charAt(4) - '0');
            num[i] = hour * 60 + minute;
        }
        Arrays.sort(num);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int diff = num[i] - num[i - 1];
            if (diff == 0) {
                return 0;
            }
            if (diff < res) {
                res = diff;
            }
        }
        return Math.min(res, 1440 + num[0] - num[n - 1]);
    }
}