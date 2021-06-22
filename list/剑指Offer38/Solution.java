import java.util.*;

public class Solution {
    private final List<String> list = new ArrayList<>(40320);

    public String[] permutation(String s) {
        dfs(s.toCharArray(), 0, s.length());
        return list.toArray(new String[0]);
    }

    private void dfs(char[] ch, int start, int n) {
        if (start == n - 1) {
            list.add(new String(ch));
            return;
        }
        for (int i = start; i < n; i++) {
            if (i == start) {
                dfs(ch, start + 1, n);
                continue;
            }
            int j = i - 1;
            while (j >= start) {
                if (ch[j] == ch[i]) {
                    break;
                }
                --j;
            }
            if (j + 1 != start) {
                continue;
            }

            char c = ch[start];
            ch[start] = ch[i];
            ch[i] = c;

            dfs(ch, start + 1, n);

            c = ch[i];
            ch[i] = ch[start];
            ch[start] = c;
        }
    }
}