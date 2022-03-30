import java.util.*;

public class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int n = arrival.length;
        List<Integer> res = new ArrayList<>();
        if (n <= k) {
            for (int i = 0; i < n; i++) {
                res.add(i);
            }
            return res;
        }
        int[] count = new int[k];
        int max = 1;
        PriorityQueue<int[]> busy = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        TreeSet<Integer> free = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            free.add(i);
        }
        for (int i = 0; i < n; i++) {
            int start = arrival[i];
            while (!busy.isEmpty() && busy.peek()[1] <= start) {
                free.add(busy.poll()[0]);
            }
            Integer next = free.ceiling(i % k);
            if (next == null) {
                next = free.ceiling(0);
            }
            if (next == null) {
                continue;
            }
            free.remove(next);
            busy.add(new int[]{next, start + load[i]});
            max = Math.max(max, ++count[next]);
        }
        for (int i = 0; i < k; i++) {
            if (count[i] == max) {
                res.add(i);
            }
        }
        return res;
    }
}