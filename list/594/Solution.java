import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : nums) {
            map.merge(v, 1, Integer::sum);
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            Integer val = map.get(k + 1);
            if (val != null) {
                max = Math.max(val + entry.getValue(), max);
            }
        }
        return max;
    }
}