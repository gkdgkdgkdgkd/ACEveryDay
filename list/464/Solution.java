import java.util.HashMap;
import java.util.Map;

public class Solution {
    private boolean[] map = new boolean[1048576];

    public boolean canIWin(int n, int m) {
        if (m <= n) {
            return true;
        }
        if (n * (n + 1) / 2 < m) {
            return false;
        }
        return dfs(0, 0, n, m);
    }

    private boolean dfs(int cur, int used, int n, int m) {
        boolean res = map[used];
        if (res) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if ((used & (1 << i)) == 0) {
                if (cur + i + 1 >= m || !dfs(cur + i + 1, used | (1 << i), n, m)) {
                    res = true;
                    break;
                }
            }
        }
        return map[used] = res;
    }
}