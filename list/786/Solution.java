public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double l = 0;
        double r = 1;
        while (true) {
            double m = (l + r) / 2;
            int i = -1;
            int count = 0;
            int x = 0;
            int y = 1;
            for (int j = 1; j < n; j++) {
                while ((double) arr[i + 1] / arr[j] < m) {
                    ++i;
                    if (arr[i] * y > arr[j] * x) {
                        x = arr[i];
                        y = arr[j];
                    }
                }
                count += i + 1;
            }
            if (count == k) {
                return new int[]{x, y};
            }
            if (count < k) {
                l = m;
            } else {
                r = m;
            }
        }
    }
}