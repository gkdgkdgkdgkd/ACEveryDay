public class Solution {
    public int minCostToMoveChips(int[] position) {
        int res = 0;
        for (int v : position) {
            if ((v & 1) == 1) {
                ++res;
            }
        }
        return Math.min(res, position.length - res);
    }
}
