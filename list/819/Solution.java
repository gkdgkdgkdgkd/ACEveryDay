import java.util.*;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        String res = "";
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        char[] c = paragraph.toCharArray();
        for (int i = 0, n = c.length; i < n; i++) {
            if ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
                StringBuilder builder = new StringBuilder();
                builder.append(c[i] >= 'A' && c[i] <= 'Z' ? (char) ('a' + (c[i] - 'A')) : c[i]);
                for (++i; i < n && ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')); ++i) {
                    builder.append(c[i] >= 'A' && c[i] <= 'Z' ? (char) ('a' + (c[i] - 'A')) : c[i]);
                }
                String str = builder.toString();
                if (!set.contains(str)) {
                    Integer count = map.get(str);
                    if (count == null) {
                        count = 0;
                    }
                    map.put(str, ++count);
                    if (count > maxCount) {
                        maxCount = count;
                        res = str;
                    }
                }
            }
        }
        return res;
    }
}