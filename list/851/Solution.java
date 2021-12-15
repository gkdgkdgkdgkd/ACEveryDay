public class Solution {
    private int[] cache;

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        int[][] list = new int[n][n];
        int[] len = new int[n];
        for (int[] r : richer) {
            list[r[1]][len[r[1]]++] = r[0];
        }
        int[] map = new int[n];
        cache = new int[n];
        for (int i = 0; i < n; i++) {
            cache[i] = -1;
            map[quiet[i]] = i;
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = map[dfs(list, len, i, quiet)];
        }
        return res;
    }

    private int dfs(int[][] list, int[] len, int i, int[] quiet) {
        if (cache[i] != -1) {
            return cache[i];
        }
        int min = quiet[i];
        for (int j = 0, l = len[i]; j < l; j++) {
            int cur = list[i][j];
            min = Math.min(min, Math.min(quiet[cur], dfs(list, len, cur, quiet)));
        }
        return cache[i] = min;
    }
}