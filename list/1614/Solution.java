public class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ++left;
            } else if (c == ')') {
                res = Math.max(left, res);
                --left;
            }
        }
        return res;
    }
}