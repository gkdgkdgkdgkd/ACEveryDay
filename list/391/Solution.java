import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        long sum = 0;
        Set<Long> set = new HashSet<>(rectangles.length);
        for (int[] rec : rectangles) {
            int a1 = rec[0];
            int b1 = rec[1];
            int a2 = rec[2];
            int b2 = rec[3];

            if (x1 > a1) {
                x1 = a1;
            }
            if (y1 > b1) {
                y1 = b1;
            }
            if (x2 < a2) {
                x2 = a2;
            }
            if (y2 < b2) {
                y2 = b2;
            }
            sum += (b2 - b1) * (long) (a2 - a1);
            removeOrAddPoint(a1, b1, set);
            removeOrAddPoint(a2, b2, set);
            removeOrAddPoint(a1, b2, set);
            removeOrAddPoint(a2, b1, set);
        }
        return set.size() == 4 && set.contains(hash(x1, y1)) && set.contains(hash(x2, y2)) && set.contains(hash(x1, y2)) && set.contains(hash(x2, y1)) && sum == (y2 - y1) * (long) (x2 - x1);
    }

    private static Long hash(int x, int y) {
        return (x + 100_000L) * 100_000 + y;
    }

    private void removeOrAddPoint(int x, int y, Set<Long> set) {
        Long h = hash(x, y);
        if (set.contains(h)) {
            set.remove(h);
        } else {
            set.add(h);
        }
    }
}