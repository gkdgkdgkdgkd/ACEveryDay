import java.util.PriorityQueue;

public class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int res = 0;
        int index = 0;
        int n = stations.length;
        while (index < n && stations[index][0] <= startFuel) {
            queue.add(stations[index++][1]);
        }
        while (startFuel < target) {
            if (queue.isEmpty()) {
                return -1;
            }
            startFuel += queue.poll();
            ++res;
            while (index < n && stations[index][0] <= startFuel) {
                queue.add(stations[index++][1]);
            }
        }
        return res;
    }
}
