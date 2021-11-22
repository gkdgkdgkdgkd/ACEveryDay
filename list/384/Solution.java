import java.util.*;

public class Solution {
    private final int[] origin;

    public Solution(int[] nums) {
        origin = nums;
    }

    public int[] reset() {
        return origin;
    }

    public int[] shuffle() {
        int n = origin.length;
        Random random = new Random();
        int[] res = Arrays.copyOf(origin, n);
        for (int i = n; i > 1; --i) {
            int temp = res[i - 1];
            int index = random.nextInt(i);
            res[i - 1] = res[index];
            res[index] = temp;
        }
        return res;
    }
}