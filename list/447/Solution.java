import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        int n = points.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                Integer d = dis(points[i], points[j]);
                if (map.containsKey(d)) {
                    int v = map.get(d);
                    res += (v<<1);
                    map.put(d, v+1);
                } else {
                    map.put(d, 1);
                }
            }
            map.clear();
        }
        return res;
    }

    public static int dis(int[] x, int[] y) {
        int dx = x[0] - y[0];
        int dy = x[1] - y[1];
        return dx * dx + dy * dy;
    }
}