public class Solution {
    private int n;
    private int res;
    private long max;

    public int countHighestScoreNodes(int[] parents) {
        n = parents.length;
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = r[i] = -1;
        }
        for (int i = 1; i < n; i++) {
            if (l[parents[i]] == -1) {
                l[parents[i]] = i;
            } else {
                r[parents[i]] = i;
            }
        }
        postorder(0, l, r);
        return res;
    }

    private int postorder(int i, int[] l, int[] r) {
        if (i == -1) {
            return 0;
        }
        int ll = postorder(l[i], l, r);
        int rr = postorder(r[i], l, r);
        long point = Math.max(ll, 1L) * Math.max(rr, 1L) * Math.max(n - ll - rr - 1, 1L);
        if (point > max) {
            max = point;
            res = 1;
        } else if (point == max) {
            ++res;
        }
        return ll + rr + 1;
    }
}