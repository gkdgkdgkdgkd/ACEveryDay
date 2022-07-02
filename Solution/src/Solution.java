import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        LinkedList<int[]> queue = new LinkedList<>();
        int start = 0;
        int n = stations.length;
        for (int i = 0; i < n && startFuel >= stations[i][0]; i++) {
            start = i;
            queue.add(new int[]{i, startFuel - stations[i][0]});
        }
        if (queue.isEmpty()) {
            return -1;
        }
        ++start;
        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] front = queue.poll();
                for (int j = start; j < n && front[1]+stations[front[0]][0] >= stations[j][0]; j++) {
                    queue.add();
                }
            }
        }
        return res;
    }
}