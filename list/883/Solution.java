public class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int res = 0;
        int top = 0;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int front = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    ++top;
                }
                front = Math.max(front, grid[j][i]);
                left = Math.max(left, grid[i][j]);
            }
            res += left + front;
        }
        return res + top;
    }
}