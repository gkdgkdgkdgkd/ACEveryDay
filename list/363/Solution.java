import java.util.*;

public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int n1 = matrix.length;
        int n2 = matrix[0].length;
        int[][] sum = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }

        int ans = -1000000;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                for (int p = i; p <= n1; p++) {
                    for (int q = j; q <= n2; q++) {
                        int temp = sum[p][q] - sum[i - 1][q] - sum[p][j - 1] + sum[i - 1][j - 1];
                        if (temp <= k) {
                            ans = Math.max(ans, temp);
                            if(ans == k){
                                return ans;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}