public class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int cur = 0;
        for (char c : s.toCharArray()) {
            if (cur + widths[c - 'a'] <= 100) {
                cur += widths[c - 'a'];
            } else {
                ++line;
                cur = widths[c - 'a'];
            }
        }
        return new int[]{line, cur};
    }
}