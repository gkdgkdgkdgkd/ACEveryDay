public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] c = s.toCharArray();
        int n = c.length;
        if (numRows == 2) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i += 2) {
                builder.append(c[i]);
            }
            for (int i = 1; i < n; i += 2) {
                builder.append(c[i]);
            }
            return builder.toString();
        }
        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builders[i] = new StringBuilder();
        }
        int cur = 0;
        int dir = 1;
        for (char v : c) {
            builders[cur].append(v);
            cur += dir;
            if (cur == numRows) {
                cur -= 2;
                dir = -1;
            } else if (cur == -1) {
                cur += 2;
                dir = 1;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (StringBuilder b : builders) {
            builder.append(b);
        }
        return builder.toString();
    }
}