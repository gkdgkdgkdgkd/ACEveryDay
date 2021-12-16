import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int x = location.get(0);
        int y = location.get(1);
        List<Double> list = new ArrayList<>(200_001);
        int cnt = 0;
        double t = angle * Math.PI / 180.0;
        for (List<Integer> p : points) {
            int a = p.get(0);
            int b = p.get(1);
            if (a == x && b == y && ++cnt >= 0) {
                continue;
            }
            list.add(Math.atan2(b - y, a - x) + Math.PI);
        }
        Collections.sort(list);
        final double pi2 = Math.PI * 2;
        int n = list.size();
        int max = 0;
        IntStream.range(0, n).forEach(i -> list.add(list.get(i) + pi2));
        n <<= 1;
        for (int i = 0, j = 0; j < n; j++) {
            while (i < j && list.get(j) - list.get(i) > t) {
                ++i;
            }
            max = Math.max(max, j - i + 1);
        }
        return cnt + max;
    }
}