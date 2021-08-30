public class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n; i += (k << 1)) {
            int l = i;
            int r = i + k - 1;
            if (r < n) {
                while (l < r) {
                    char t = c[l];
                    c[l] = c[r];
                    c[r] = t;
                    ++l;
                    --r;
                }
            } else {
                r = n - 1;
                while (l < r) {
                    char t = c[l];
                    c[l] = c[r];
                    c[r] = t;
                    ++l;
                    --r;
                }
            }
        }
        return new String(c);
    }
}