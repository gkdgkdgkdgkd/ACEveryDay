public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            res += (((i + 1) >> 1) * ((n - i) >> 1) + ((i + 2) >> 1) * ((n + 1 - i) >> 1)) * arr[i];
        }
        return res;
    }
}