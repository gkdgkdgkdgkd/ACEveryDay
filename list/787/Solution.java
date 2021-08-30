import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] graph = new int[n][n];
        for (int[] f : flights) {
            graph[f[0]][f[1]] = f[2];
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(e -> e[1]));
        int[] costs = new int[n];
        int[] stops = new int[n];
        Arrays.fill(costs, Integer.MAX_VALUE);
        heap.offer(new int[]{src, 0, k});

        while (!heap.isEmpty()) {
            int[] front = heap.poll();
            int v = front[0];
            int cost = front[1];
            int stop = front[2];

            if (v == dst) {
                return cost;
            } else if (stop < 0) {
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (graph[v][i] > 0) {
                    int costI = costs[i];
                    int costVI = graph[v][i];
                    if(cost + costVI < costI){
                        heap.add(new int[]{i, cost + costVI, stop - 1});
                        costs[i] = costVI + cost;
                        stops[i] = stop - 1;
                    }else if(stops[i] < stop - 1){
                        heap.add(new int[]{i, cost + costVI, stop - 1});
                    }
                }
            }
        }
        return -1;
    }
}