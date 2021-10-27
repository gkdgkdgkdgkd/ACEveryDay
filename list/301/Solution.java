import java.util.*;

public class Solution {
    private final Set<String> set = new HashSet<>();
    private int len;
    private String s;

    public List<String> removeInvalidParentheses(String s) {
        this.s = s;
        int r = 0;
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ++l;
            } else if (c == ')') {
                ++r;
            }
        }
        dfs(0, s.length(), "", 0, Math.min(l, r));
        return new ArrayList<>(set);
    }

    private void dfs(int i, int n, String cur, int score, int max) {
        if (score < 0 || score > max) {
            return;
        }
        if (i == n) {
            if (score == 0 && cur.length() >= len) {
                if (cur.length() > len) {
                    set.clear();
                }
                len = cur.length();
                set.add(cur);
            }
            return;
        }
        char c = s.charAt(i);
        if (c == '(') {
            dfs(i + 1, n, cur + c, score + 1, max);
            dfs(i + 1, n, cur, score, max);
        } else if (c == ')') {
            dfs(i + 1, n, cur + c, score - 1, max);
            dfs(i + 1, n, cur, score, max);
        } else {
            dfs(i + 1, n, cur + c, score, max);
        }
    }
}