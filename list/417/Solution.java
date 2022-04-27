import java.util.ArrayList;
import java.util.List;

public class Solution {
    private boolean[][] pacificOcean;
    private boolean[][] atlanticOcean;
    private boolean[][] ocean;
    private int m;
    private int n;
    private static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int[][] heights;
    private final List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        if (m == 1 || n == 1) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    res.add(List.of(i, j));
                }
            }
            return res;
        }
        pacificOcean = new boolean[m][n];
        atlanticOcean = new boolean[m][n];
        this.heights = heights;
        this.ocean = pacificOcean;
        for (int i = 1; i < m; i++) {
            dfs(i, 0);
        }
        for (int j = 1; j < n; j++) {
            dfs(0, j);
        }

        this.ocean = atlanticOcean;
        for (int i = 0; i < m - 1; i++) {
            dfs(i, n - 1);
        }
        for (int j = 0; j < n - 1; j++) {
            dfs(m - 1, j);
        }
        return res;
    }

    private void dfs(int x, int y) {
        if (ocean[x][y]) {
            return;
        }
        ocean[x][y] = true;
        if (pacificOcean[x][y] && atlanticOcean[x][y]) {
            res.add(List.of(x, y));
        }
        for (int i = 0; i < 4; i++) {
            int xx = x + dir[i][0];
            int yy = y + dir[i][1];
            if (xx >= 0 && yy >= 0 && xx < m && yy < n && heights[x][y] <= heights[xx][yy]) {
                dfs(xx, yy);
            }
        }
    }
}