public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int res = 0;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if (arr[m] > arr[m + 1]) {
                res = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }
}