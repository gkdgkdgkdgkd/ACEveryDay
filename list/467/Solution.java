public class Solution {
    public int findSubstringInWraproundString(String p) {
        int[] maxLength = new int[26];
        int last = -1;
        int max = 0;
        for (char c : p.toCharArray()) {
            int cur = c - 'a';
            max = (cur == last + 1) || (last == 25 && cur == 0) ? max + 1 : 1;
            if (max > maxLength[cur]) {
                maxLength[cur] = max;
            }
            last = cur;
        }
        int res = 0;
        for (int v : maxLength) {
            res += v;
        }
        return res;
    }
}