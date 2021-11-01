public class Solution {
    private static final int SHIFT = 100_000;

    public int distributeCandies(int[] candyType) {
        boolean[] set = new boolean[200_001];
        int res = 0;
        int half = candyType.length >> 1;
        for (int v : candyType) {
            if (!set[v + SHIFT]) {
                ++res;
                if (res >= half) {
                    break;
                }
                set[v + SHIFT] = true;
            }
        }
        return res;
    }
}