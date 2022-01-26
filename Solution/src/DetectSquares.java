import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DetectSquares {
    private final Map<Integer, Map<Integer, Integer>> count = new HashMap<>();

    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        count.putIfAbsent(y, new HashMap<>());
        Map<Integer, Integer> yCount = count.get(y);
        yCount.put(x, yCount.getOrDefault(x, 0) + 1);
    }

    public int count(int[] point) {
        int res = 0;
        int x = point[0];
        int y = point[1];
        if (!count.containsKey(y)) {
            return 0;
        }
        Map<Integer, Integer> yCount = count.get(y);
        Set<Map.Entry<Integer, Map<Integer, Integer>>> entries = count.entrySet();
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : entries) {
            int col = entry.getKey();
            Map<Integer, Integer> colCount = entry.getValue();
            if (col != y) {
                int d = col - y;
                res += colCount.getOrDefault(x, 0) * yCount.getOrDefault(x + d, 0) * colCount.getOrDefault(x + d, 0);
                res += colCount.getOrDefault(x, 0) * yCount.getOrDefault(x - d, 0) * colCount.getOrDefault(x - d, 0);
            }
        }
        return res;
    }
}
