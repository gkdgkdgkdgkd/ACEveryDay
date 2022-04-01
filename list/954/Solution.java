public class Solution {
    public boolean canReorderDoubled(int[] arr) {
        int max = 0;
        int min = 0;
        int zeroCount = 0;
        for (int v : arr) {
            if (v > 0) {
                max = Math.max(max, v);
            } else if (v < 0) {
                min = Math.min(min, v);
            } else {
                ++zeroCount;
            }
        }
        min = -min;
        if ((zeroCount & 1) == 1 || (max & 1) == 1 || (min & 1) == 1) {
            return false;
        }
        int[] positive = new int[max + 1];
        int[] negative = new int[min + 1];
        for (int v : arr) {
            if (v > 0) {
                ++positive[v];
            } else if (v < 0) {
                ++negative[-v];
            }
        }
        zeroCount >>= 1;
        for (int i = 1, limit = max >> 1; i <= limit; ++i) {
            if (positive[i] == 0) {
                continue;
            }
            zeroCount += positive[i];
            if ((positive[i << 1] -= positive[i]) < 0) {
                return false;
            }
        }
        for (int i = 1, limit = min >> 1; i <= limit; i++) {
            if (negative[i] == 0) {
                continue;
            }
            zeroCount += negative[i];
            if ((negative[i << 1] -= negative[i]) < 0) {
                return false;
            }
        }
        return zeroCount == (arr.length >> 1);
    }
}