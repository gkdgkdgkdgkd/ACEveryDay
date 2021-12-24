import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int eatenApples(int[] apples, int[] days) {
        int i = 0;
        int res = 0;
        int n = apples.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        while (i < n) {
            while (!queue.isEmpty() && queue.peek()[0] <= i) {
                queue.poll();
            }
            int rottenDay = i + days[i];
            if (apples[i] > 0) {
                queue.add(new int[]{rottenDay, apples[i]});
            }
            if (!queue.isEmpty()) {
                int[] arr = queue.peek();
                if (--arr[1] == 0) {
                    queue.poll();
                }
                ++res;
            }
            ++i;
        }
        while (!queue.isEmpty()) {
            while (!queue.isEmpty() && queue.peek()[0] <= i) {
                queue.poll();
            }
            if (queue.isEmpty()) {
                break;
            }
            int[] arr = queue.poll();
            int cur = Math.min(arr[0] - i, arr[1]);
            res += cur;
            i += cur;
        }
        return res;
    }
}