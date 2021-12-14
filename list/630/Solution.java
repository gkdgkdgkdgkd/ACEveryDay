import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(a -> -a));
        int cur = 0;
        for (int[] c : courses) {
            if (cur + c[0] <= c[1]) {
                queue.add(c[0]);
                cur += c[0];
            } else if (!queue.isEmpty() && c[0] < queue.peek()) {
                cur -= queue.poll();
                queue.add(c[0]);
                cur += c[0];
            }
        }
        return queue.size();
    }
}