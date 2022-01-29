import java.util.*;

public class Solution {
    public int[][] highestPeak(int[][] isWater) {
        final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(res[i], -1);
        }
        int[][] queue = new int[1_000_000][];
        int front = 0;
        int tail = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    res[i][j] = 0;
                    queue[tail++] = new int[]{i, j};
                }
            }
        }
        while (front < tail) {
            int[] top = queue[front++];
            for (int[] dir : dirs) {
                int x = top[0] + dir[0];
                int y = top[1] + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n && res[x][y] == -1) {
                    res[x][y] = res[top[0]][top[1]] + 1;
                    queue[tail++] = new int[]{x, y};
                }
            }
        }
        return res;
    }
}