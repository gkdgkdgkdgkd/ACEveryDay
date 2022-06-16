public class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] arrCopy = new int[n];
        System.arraycopy(arr, 0, arrCopy, 0, n);
        for (int i = 0, j = 0; i < n; ++i, ++j) {
            arr[i] = arrCopy[j];
            if (arrCopy[j] == 0 && i + 1 < n) {
                arr[++i] = 0;
            }
        }
    }
}