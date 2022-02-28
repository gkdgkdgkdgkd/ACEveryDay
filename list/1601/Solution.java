public class Solution {
    private int temp = 0;
    private int[] degree;
    private int res = 0;

    public int maximumRequests(int n, int[][] req) {
        degree = new int[n];
        dfs(0, req, req.length);
        return res;
    }

    private void dfs(int i, int[][] req, int len) {
        if (i == len) {
            for (int v : degree) {
                if (v != 0) {
                    return;
                }
            }
            res = Math.max(res, temp);
            return;
        }
        dfs(i + 1, req, len);
        int x = req[i][0];
        int y = req[i][1];
        --degree[x];
        ++degree[y];
        ++temp;
        dfs(i + 1, req, len);
        ++degree[x];
        --degree[y];
        --temp;
    }
}