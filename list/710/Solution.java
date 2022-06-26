import java.util.*;

public class Solution {
    private final Map<Integer, Integer> map = new HashMap<>();
    private final Random random = new Random();
    private final int bound;

    public Solution(int n, int[] blacklist) {
        bound = n - blacklist.length;
        Set<Integer> set = new HashSet<>();
        for (int v : blacklist) {
            if (v >= bound) {
                set.add(v);
            }
        }

        int start = bound;
        for (int v : blacklist) {
            if (v < bound) {
                while (set.contains(start)) {
                    ++start;
                }
                map.put(v, start++);
            }
        }
    }

    public int pick() {
        int val = random.nextInt(bound);
        return map.getOrDefault(val, val);
    }
}