public class Solution {
    public int minDeletionSize(String[] strs) {
        int len = strs.length;
        int n = strs[0].length();
        int res = 0;
        for (int j = 0; j < n; j++) {
            char last = strs[0].charAt(j);
            for (int i = 1; i < len; i++) {
                char cur = strs[i].charAt(j);
                if (cur < last) {
                    ++res;
                    break;
                }
                last = cur;
            }
        }
        return res;
    }
}