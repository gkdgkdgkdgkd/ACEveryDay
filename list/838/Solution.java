public class Solution {
    public String pushDominoes(String dominoes) {
        char[] c = dominoes.toCharArray();
        for (int i = 0, n = c.length; i < n; i++) {
            if (c[i] == '.') {
                int l = i - 1;
                while (i < n && c[i] == '.') {
                    ++i;
                }
                int r = i;
                if (l < 0 || c[l] == 'L') {
                    if (r < n && c[r] == 'L') {
                        for (int j = l + 1; j < r; j++) {
                            c[j] = 'L';
                        }
                    }
                } else if (r == n || c[r] == 'R') {
                    for (int j = l; j < r; j++) {
                        c[j] = 'R';
                    }
                } else {
                    for (++l, --r; l < r; ++l, --r) {
                        c[l] = 'R';
                        c[r] = 'L';
                    }
                }
            }
        }
        return new String(c);
    }
}