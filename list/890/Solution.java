import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        int n = pattern.length();
        int[] patternIndex = new int[n];
        for (int i = 0; i < n; i++) {
            patternIndex[i] = pattern.charAt(i) - 'a';
        }
        for (String str : words) {
            int[] map = new int[26];
            int used = 0;
            Arrays.fill(map, -1);
            int i = 0;
            for (; i < n; ++i) {
                int strIndex = str.charAt(i) - 'a';
                if (map[patternIndex[i]] == -1) {
                    if ((used & (1 << strIndex)) != 0) {
                        break;
                    } else {
                        map[patternIndex[i]] = strIndex;
                        used |= (1 << strIndex);
                    }
                } else if (map[patternIndex[i]] != strIndex) {
                    break;
                }
            }
            if (i == n) {
                res.add(str);
            }
        }
        return res;
    }
}