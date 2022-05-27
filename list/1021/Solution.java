public class Solution {
    public String removeOuterParentheses(String s) {
        int l = 0;
        char[] c = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0, n = c.length; i < n; i++) {
            if (c[i] == '(') {
                ++l;
                if (l > 1) {
                    res.append('(');
                }
            } else {
                if (l > 1) {
                    res.append(')');
                }
                --l;
            }
        }
        return res.toString();
    }
}