import java.util.*;

public class Solution {
    private final Map<Integer, Integer> map = new HashMap<>();
    private final Random random = new Random();
    private int count;
    private final int m;
    private final int n;

    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        reset();
    }

    public int[] flip() {
        int x = random.nextInt(count--);
        int val = map.getOrDefault(x, x);
        map.put(x, map.getOrDefault(count, count));
        return new int[]{val / n, val % n};
    }

    public void reset() {
        count = m * n;
        map.clear();
    }
}