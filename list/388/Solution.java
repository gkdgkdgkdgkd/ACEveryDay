public class Solution {
    public int lengthLongestPath(String input) {
        int[] map = new int[20];
        int curLen = 0;
        int curLevel = -1;
        int res = 0;
        for (String str : input.split("\n")) {
            int level = 0;
            int n = str.length();
            while (level < n && str.charAt(level) == '\t') {
                ++level;
            }
            while (curLevel >= level) {
                curLen -= map[curLevel];
                --curLevel;
            }
            ++curLevel;
            curLen += (map[level] = n - level);
            if (str.contains(".")) {
                res = Math.max(res, curLen + curLevel);
            }
        }
        return res;
    }
}