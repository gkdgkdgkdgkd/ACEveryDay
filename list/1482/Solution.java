public class Solution {

    private int[] bloomDay;

    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > (this.bloomDay = bloomDay).length) {
            return -1;
        }

        int low = 1;
        int high = 1;
        for (int day : bloomDay) {
            if (day > high) {
                high = day;
            }
        }

        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (check(mid, m, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean check(int day, int m, int k) {
        int flowers = 0;
        int[] bloomDay = this.bloomDay;
        int n = bloomDay.length;

        for (int i = 0; i < n; ++i) {
            if (bloomDay[i] <= day) {
                if (++flowers == k) {
                    if (--m == 0) {
                        return true;
                    }
                    flowers = 0;
                }
            } else {
                if (i + m * k > n) {
                    return false;
                }
                flowers = 0;
            }
        }
        return false;
    }
}