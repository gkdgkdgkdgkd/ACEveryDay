import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private long[] h;
    private long[] p;

    public String longestDupSubstring(String s) {
        final int P = 1313131;
        int n = s.length();

        h = new long[n + 10];
        p = new long[n + 10];
        p[0] = 1;
        for (int i = 0; i < n; i++) {
            p[i + 1] = p[i] * P;
            h[i + 1] = h[i] * P + s.charAt(i);
        }
        String res = "";
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r + 1) >> 1;
            String t = check(s, m);
            if (t.length() != 0) {
                l = m;
            } else {
                r = m - 1;
            }
            res = t.length() > res.length() ? t : res;
        }
        return res;
    }

    private String check(String s, int m) {
        int n = s.length();
        Set<Long> set = new HashSet<>();
        for (int i = 1; i + m - 1 <= n; i++) {
            int j = i + m - 1;
            long cur = h[j] - h[i - 1] * p[j - i + 1];
            if (set.contains(cur)) {
                return s.substring(i - 1, j);
            }
            set.add(cur);
        }
        return "";
    }
}