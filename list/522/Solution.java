public class Solution {
    public int findLUSlength(String[] strs) {
        int res = -1;
        for (int i = 0, n = strs.length; i < n; i++) {
            if (strs[i].length() > res) {
                boolean notSub = false;
                for (int j = 0; j < n; j++) {
                    if (j != i && isSubsequence(strs[i], strs[j])) {
                        notSub = true;
                        break;
                    }
                }
                if (!notSub) {
                    res = Math.max(res, strs[i].length());
                }
            }
        }
        return res;
    }

    private boolean isSubsequence(String a, String b) {
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        int p1 = 0;
        int n1 = c1.length;
        for (int p2 = 0, n2 = c2.length; p1 < n1 && p2 < n2; ++p2) {
            if (c1[p1] == c2[p2]) {
                ++p1;
            }
        }
        return p1 == n1;
    }
}