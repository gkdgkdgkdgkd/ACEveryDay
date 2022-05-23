import java.util.*;

public class Solution {
    private int m;
    private int n;
    private boolean[][] zero;
    private static final int[] dirs = {-1, 0, 1, 0, -1};

    public int cutOffTree(List<List<Integer>> listForest) {
        List<int[]> list = new ArrayList<>();
        m = listForest.size();
        n = listForest.get(0).size();
        zero = new boolean[m][n];
        if (listForest.get(0).get(0) == 0) {
            return -1;
        }
        for (int i = 0; i < m; i++) {
            List<Integer> arr = listForest.get(i);
            for (int j = 0; j < n; j++) {
                int v = arr.get(j);
                if (v > 1) {
                    list.add(new int[]{v, i, j});
                } else if (v == 0) {
                    zero[i][j] = true;
                }
            }
        }
        list.sort(Comparator.comparingInt(a -> a[0]));
        int res = 0;
        int lastX = 0;
        int lastY = 0;
        for (int[] v : list) {
            int dis = bfs(lastX, lastY, v[1], v[2]);
            if (dis == -1) {
                return -1;
            }
            res += dis;
            lastX = v[1];
            lastY = v[2];
        }
        return res;
    }

    private int bfs(int x1, int y1, int x2, int y2) {
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x1, y1, 0});
        boolean[][] visit = new boolean[m][n];
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] cur = queue.pollFirst();
                int x = cur[0];
                int y = cur[1];
                int dis = cur[2];
                if (x == x2 && y == y2) {
                    return dis;
                }
                visit[x][y] = true;
                for (int i = 1; i < 5; i++) {
                    int nx = x + dirs[i - 1];
                    int ny = y + dirs[i];
                    if (nx >= m || nx < 0 || ny >= n || ny < 0 || zero[nx][ny] || visit[nx][ny]) {
                        continue;
                    }
                    if ((i == 1 && x > x2) || (i == 2 && y < y2) || (i == 3 && x < x2) || (i == 4 && y > y2)) {
                        queue.addFirst(new int[]{nx, ny, dis + 1});
                    } else {
                        queue.addLast(new int[]{nx, ny, dis + 1});
                    }
                }
            }
        }
        return -1;
    }
}