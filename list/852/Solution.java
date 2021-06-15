public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (arr[m] > arr[l]) {
                l = m;
            } else {
                r = m;
            }
        }
        while (arr[l] < arr[l-1]) {
            r = l;
            l = 0;
            while (l < r) {
                int m = (l + r) >> 1;
                if (arr[m] > arr[l]) {
                    l = m;
                } else {
                    r = m;
                }
            }
        }
        return l;
    }
}