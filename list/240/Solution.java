public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int x = matrix.length - 1;
        int y = 0;
        while (x >= 0 && y < n) {
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                --x;
            } else {
                ++y;
            }
        }
        return false;
    }
}