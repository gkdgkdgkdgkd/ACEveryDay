public class Solution {
    public int maxPower(String s) {
        char last = ' ';
        int cur = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == last) {
                ++cur;
            } else {
                res = Math.max(res, cur);
                last = c;
                cur = 1;
            }
        }
        return Math.max(cur, res);
    }
}