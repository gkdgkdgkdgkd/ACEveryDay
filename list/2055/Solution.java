public class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        char[] c = s.toCharArray();
        int n = c.length;
        int[] sum = new int[n + 1];
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0, j = n - 1, ll = -1, rr = -1; i < n; ++i, --j) {
            if (c[i] == '|') {
                ll = i;
            }
            if (c[j] == '|') {
                rr = j;
            }
            l[i] = ll;
            r[j] = rr;
            sum[i + 1] = sum[i] + (c[i] == '*' ? 1 : 0);
        }
        int m = queries.length;
        int[] res = new int[m];
        for (int i = 0; i < m; ++i) {
            int ll = r[queries[i][0]];
            int rr = l[queries[i][1]];
            if (ll != -1 && ll <= rr) {
                res[i] = sum[rr + 1] - sum[ll];
            }
        }
        return res;
    }
}