import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            int index = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            boolean isColMax = true;
            for (int j = 0; j < m; j++) {
                if(matrix[i][index] < matrix[j][index]) {
                    isColMax = false;
                    break;
                }
            }
            if(isColMax){
                res.add(min);
            }
        }
        return res;
    }
}