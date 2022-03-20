import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int networkBecomesIdle(int[][] edges, int[] patience) {
        int n = patience.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] e : edges) {
            List<Integer> list = map.get(e[0]);
            if (list == null) {
                list = new ArrayList<>();
                list.add(e[1]);
                map.put(e[0], list);
            } else {
                list.add(e[1]);
            }
            list = map.get(e[1]);
            if (list == null) {
                list = new ArrayList<>();
                list.add(e[0]);
                map.put(e[1], list);
            } else {
                list.add(e[0]);
            }
        }
        int[] queue = new int[n];
        int front = 0;
        int tail = 0;
        queue[tail++] = 0;
        int res = 0;
        boolean[] visit = new boolean[n];
        visit[0] = true;
        int round = 2;
        while (front < tail) {
            int size = tail - front;
            for (int i = 0; i < size; i++) {
                int top = queue[front++];
                for (int v : map.get(top)) {
                    if (!visit[v]) {
                        res = Math.max(res, patience[v] * ((round - 1) / patience[v]) + round + 1);
                        queue[tail++] = v;
                        visit[v] = true;
                    }
                }
            }
            round += 2;
        }
        return res;
    }
}