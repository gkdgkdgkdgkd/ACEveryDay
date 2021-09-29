public class Solution {
    public int findMinMoves(int[] machines) {
        int res = 0;
        int n = machines.length;
        int target = 0;
        for (int v : machines) {
            target += v;
        }
        int l = 0;
        int r = target;
        if (target % n != 0) {
            return -1;
        }
        target /= n;

        for (int i = 0; i < n; i++) {
            r -= machines[i];
            int ll = Math.max(0, i * target - l);
            int rr = Math.max(0, (n - i - 1) * target - r);
            res = Math.max(ll + rr, res);
            l += machines[i];
        }
        return res;
    }
}