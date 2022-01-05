public class Solution {
    public String modifyString(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3 && c[i] == '?'; j++) {
                if ((i - 1 < 0 || c[i - 1] != j + 'a') && (i + 1 >= n || c[i + 1] != j + 'a')) {
                    c[i] = (char) (j + 'a');
                }
            }
        }
        return new String(c);
    }
}