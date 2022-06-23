import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> idMap = new HashMap<>();
        for (String word : words) {
            idMap.putIfAbsent(word, idMap.size());
        }
        int[] cntMap = new int[idMap.size()];
        for (String word : words) {
            ++cntMap[idMap.get(word)];
        }
        char[] str = s.toCharArray();
        int m = str.length;
        int n = words.length;
        int wordLen = words[0].length();
        int totalLen = n * wordLen;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < wordLen; i++) {
            for (int j = i; j <= m - totalLen; j += wordLen) {
                int[] windowCntMap = new int[idMap.size()];
                for (int no = n - 1; no >= 0; no--) {
                    int begin = j + no * wordLen;
                    String word = new String(str, begin, wordLen);
                    Integer id = idMap.get(word);
                    if (id == null || windowCntMap[id]++ == cntMap[id]) {
                        j = begin;
                        break;
                    }
                    if (no == 0) {
                        res.add(j);
                    }
                }
            }
        }
        return res;
    }
}