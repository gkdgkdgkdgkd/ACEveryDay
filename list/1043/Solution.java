public class Solution {
    private int m;
    private int n;

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        m = grid.length;
        n = grid[0].length;
        dfs(row, col, grid, grid[row][col], color, new boolean[m][n]);
        return grid;
    }

    private int dfs(int x, int y, int[][] grid, int startColor, int newColor, boolean[][] visit) {
        if (x < 0 || x >= m || y < 0 || y >= n) {
            return 0;
        }
        if (visit[x][y]) {
            return 1;
        }
        if (grid[x][y] != startColor) {
            return 0;
        }
        visit[x][y] = true;
        if (dfs(x - 1, y, grid, startColor, newColor, visit) + dfs(x + 1, y, grid, startColor, newColor, visit)
                + dfs(x, y - 1, grid, startColor, newColor, visit) + dfs(x, y + 1, grid, startColor, newColor, visit) < 4) {
            grid[x][y] = newColor;
        }
        return 1;
    }
}