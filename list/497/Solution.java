import java.util.Random;

public class Solution {
    private int sum = 0;
    private final int[] preSum;
    private final Random random = new Random();
    private final int n;
    private final int[][] rects;

    public Solution(int[][] rects) {
        this.rects = rects;
        preSum = new int[n = rects.length];
        for (int i = 0; i < n; i++) {
            preSum[i] = (sum += (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1));
        }
    }

    public int[] pick() {
        int l = 0;
        int r = n - 1;
        int area = random.nextInt(sum);
        while (l <= r) {
            int m = (l + r) >> 1;
            if (preSum[m] <= area) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return new int[]{random.nextInt(rects[l][2] - rects[l][0] + 1) + rects[l][0], random.nextInt(rects[l][3] - rects[l][1] + 1) + rects[l][1]};
    }
}