import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    private static final String CDATA1 = "<![CDATA[";
    private static final String CDATA2 = "]]>";

    public boolean isValid(String s) {
        Deque<String> d = new ArrayDeque<>();
        int n = s.length(), i = 0;
        while (i < n) {
            if (i + 8 < n && s.startsWith(CDATA1, i)) {
                if (i == 0) return false;
                int j = i + 9;
                boolean ok = false;
                while (j < n && !ok) {
                    if (j + 2 < n && s.startsWith(CDATA2, j)) {
                        j = j + 3;
                        ok = true;
                    } else {
                        j++;
                    }
                }
                if (!ok) return false;
                i = j;
            } else if (s.charAt(i) == '<') {
                if (i == n - 1) return false;
                boolean isEnd = s.charAt(i + 1) == '/';
                int p = isEnd ? i + 2 : i + 1, j = p;
                while (j < n && s.charAt(j) != '>') {
                    if (!Character.isUpperCase(s.charAt(j))) return false;
                    j++;
                }
                if (j == n) return false;
                int len = j - p;
                if (len < 1 || len > 9) return false;
                String tag = s.substring(p, j);
                i = j + 1;
                if (!isEnd) {
                    d.addLast(tag);
                } else {
                    if (d.isEmpty() || !d.pollLast().equals(tag)) return false;
                    if (d.isEmpty() && i < n) return false;
                }
            } else {
                if (i == 0) return false;
                i++;
            }
        }
        return d.isEmpty();
    }
}