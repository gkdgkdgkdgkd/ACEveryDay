public class Solution {
    public int getMaximumGenerated(int n) {
        if (n <= 1) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i >> 1];
            if ((i & 1) == 1) {
                arr[i] += arr[(i >> 1) + 1];
            }
            max = Math.max(arr[i],max);
        }
        return max;
    }
}