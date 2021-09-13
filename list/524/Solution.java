import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String max = "";
        int maxLen = 0;
        char[] c = s.toCharArray();
        int len = c.length;
        for (String str : dictionary) {
            char[] cd = str.toCharArray();
            int i = 0;
            int j = 0;
            int cdLen = cd.length;
            while (i < len && j < cdLen) {
                if (c[i] == cd[j]) {
                    ++j;
                }
                ++i;
            }
            if (j == cdLen) {
                if (maxLen == 0 || cdLen > maxLen || (cdLen == maxLen && str.compareTo(max) < 0)) {
                    max = str;
                    maxLen = cdLen;
                }
            }
        }
        return max;
    }
}