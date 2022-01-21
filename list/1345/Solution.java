import java.util.*;

public class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int v = arr[i];
            if (!map.containsKey(v)) {
                map.put(v, new LinkedList<>());
            }
            if (i > 0 && i < n - 1 && arr[i] == arr[i - 1] && arr[i] == arr[i + 1]) {
                continue;
            }
            map.get(arr[i]).addLast(i);
        }
        int[] queue = new int[n];
        int front = 0;
        int tail = 0;
        boolean[] visit = new boolean[n];
        visit[0] = true;
        queue[tail++] = 0;
        int res = 0;
        while (front < tail) {
            int size = tail - front;
            for (int i = 0; i < size; i++) {
                int top = queue[front++];
                if (top == n - 1) {
                    return res;
                }
                if (top - 1 >= 0 && !visit[top - 1]) {
                    visit[top - 1] = true;
                    queue[tail++] = top - 1;
                }
                if (top + 1 < n && !visit[top + 1]) {
                    if (top + 1 == n - 1) {
                        return res + 1;
                    }
                    visit[top + 1] = true;
                    queue[tail++] = top + 1;
                }
                LinkedList<Integer> sameValIndex = map.get(arr[top]);
                if (sameValIndex != null) {
                    for (int v : sameValIndex) {
                        if (v == n - 1) {
                            return res + 1;
                        }
                        if (!visit[v]) {
                            visit[v] = true;
                            queue[tail++] = v;
                        }
                    }
                    map.remove(arr[top]);
                }
            }
            ++res;
        }
        return res;
    }
}