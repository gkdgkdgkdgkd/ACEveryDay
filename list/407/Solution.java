import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        boolean[][] visit = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            visit[i][0] = visit[i][n - 1] = true;
            queue.add(new int[]{i, 0, heightMap[i][0]});
            queue.add(new int[]{i, n - 1, heightMap[i][n - 1]});
        }

        for (int j = 1; j < n - 1; j++) {
            visit[0][j] = visit[m - 1][j] = true;
            queue.add(new int[]{0, j, heightMap[0][j]});
            queue.add(new int[]{m - 1, j, heightMap[m - 1][j]});
        }

        int res = 0;
        int[] dir = {-1, 0, 1, 0, -1};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = cur[0] + dir[k];
                int y = cur[1] + dir[k + 1];
                if (x >= 0 && x < m && y >= 0 && y < n && !visit[x][y]) {
                    if (cur[2] > heightMap[x][y]) {
                        res += cur[2] - heightMap[x][y];
                    }
                    queue.add(new int[]{x, y, Math.max(heightMap[x][y], cur[2])});
                    visit[x][y] = true;
                }
            }
        }
        return res;
    }
}