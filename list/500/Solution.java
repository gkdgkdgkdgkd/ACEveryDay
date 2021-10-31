import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final char[][] lines = {
            {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
            {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'},
            {'z', 'x', 'c', 'v', 'b', 'n', 'm'}
    };

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for (String str : words) {
            char[] c = str.toCharArray();
            char first = Character.toLowerCase(c[0]);
            int line = inLine(first, 0) ? 0 : (inLine(first, 1) ? 1 : 2);
            int n = c.length;
            int i = 1;
            while (i < n) {
                if (!inLine(Character.toLowerCase(c[i]), line)) {
                    break;
                }
                ++i;
            }
            if (i == n) {
                res.add(str);
            }
        }
        return res.toArray(String[]::new);
    }

    private static boolean inLine(char c, int line) {
        for (char cc : lines[line]) {
            if (cc == c) {
                return true;
            }
        }
        return false;
    }
}