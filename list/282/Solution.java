import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<String> res = new ArrayList<>();

    public List<String> addOperators(String num, int target) {
        if (Long.parseLong(num) > Integer.MAX_VALUE) {
            return res;
        }
        dfs(0, num.toCharArray(), target, 0, 0, "");
        return res;
    }

    private void dfs(int startIndex, char[] c, int target, long cur, long pre, String exp) {
        int n = c.length;
        if (startIndex == n) {
            if (cur == target) {
                res.add(exp);
            }
            return;
        }
        for (int i = startIndex; i < n; i++) {
            if (i != startIndex && c[startIndex] == '0') {
                break;
            }
            long next = 0;
            for (int j = startIndex; j <= i; j++) {
                next *= 10;
                next += c[j] - '0';
            }
            if (startIndex == 0) {
                dfs(i + 1, c, target, next, next, "" + next);
            } else {
                dfs(i + 1, c, target, cur + next, next, exp + "+" + next);
                dfs(i + 1, c, target, cur - next, -next, exp + "-" + next);
                long x = pre * next;
                dfs(i + 1, c, target, cur - pre + x, x, exp + "*" + next);
            }
        }
    }
}