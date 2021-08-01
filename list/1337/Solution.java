import java.util.Arrays;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[] list = new int[m];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int v : mat[i]) {
                if (v == 1) {
                    ++sum;
                } else {
                    break;
                }
            }
            list[i] = sum * 100 + i;
        }
        Arrays.sort(list);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list[i] % 100;
        }
        return res;
    }
}