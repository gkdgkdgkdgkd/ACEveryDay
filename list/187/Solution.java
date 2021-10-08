import java.util.*;

public class Solution {
    private static final int[] mapToInt = new int[26];
    private static final int MASK = 0x000fffff;

    static {
        mapToInt['A' - 'A'] = 0;
        mapToInt['C' - 'A'] = 1;
        mapToInt['G' - 'A'] = 2;
        mapToInt['T' - 'A'] = 3;
    }

    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        if (n <= 10 || n > 10000) {
            return Collections.emptyList();
        }
        int cur = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < 9; i++) {
            cur <<= 2;
            cur |= mapToInt[c[i] - 'A'];
        }
        List<String> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 9; i < n; i++) {
            cur <<= 2;
            cur &= MASK;
            cur |= mapToInt[c[i] - 'A'];
            int count = map.getOrDefault(cur, 0);
            if (count == 1) {
                res.add(s.substring(i - 9, i + 1));
            }
            if (count < 2) {
                map.put(cur, count + 1);
            }
        }
        return res;
    }
}