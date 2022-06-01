import java.util.Arrays;

public class Solution {
    private int n;
    private int ALL_USED_VAL;

    public boolean makesquare(int[] matchsticks) {
        n = matchsticks.length;
        if (n < 4) {
            return false;
        }
        int sum = 0;
        for (int v : matchsticks) {
            sum += v;
        }
        if (sum % 4 != 0) {
            return false;
        }
        Arrays.sort(matchsticks);
        for (int i = 0; i < n; i++) {
            ALL_USED_VAL <<= 1;
            ALL_USED_VAL |= 1;
        }
        return dfs(0, 0, sum >> 2, 0, 0, matchsticks);
    }

    private boolean dfs(int start, int cur, int target, int used, int count, int[] arr) {
        int n = this.n;
        if (count == 4) {
            return used == ALL_USED_VAL;
        }
        if (cur == target) {
            return dfs(0, 0, target, used, count + 1, arr);
        }
        for (int i = start; i < n; i++) {
            if ((used & (1 << i)) == 0) {
                if (cur + arr[i] <= target) {
                    used |= (1 << i);
                    if (dfs(i + 1, cur + arr[i], target, used, count, arr)) {
                        return true;
                    }
                    used ^= (1 << i);
                }
                while (i + 1 < n && arr[i] == arr[i + 1]) {
                    ++i;
                }
            }
        }
        return false;
    }
}