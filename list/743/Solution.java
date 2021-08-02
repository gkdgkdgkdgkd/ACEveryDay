import java.util.Arrays;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE >> 1);
        }
        for (int i = 0; i < n; i++) {
            graph[i][i] = 0;
        }
        for (int[] time : times) {
            graph[time[0] - 1][time[1] - 1] = time[2];
        }
        for (int l = 0; l < n; l++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][l] + graph[l][j] < graph[i][j]) {
                        graph[i][j] = graph[i][l] + graph[l][j];
                    }
                }
            }
        }
        int max = -1;
        --k;
        for (int i = 0; i < n; i++) {
            if (graph[k][i] > max) {
                max = graph[k][i];
            }
        }
        return max == (Integer.MAX_VALUE >> 1) ? -1 : max;
    }
}