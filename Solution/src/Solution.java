public class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int l = i;
            int r = i;
            int[] count = new int[26];
            int max = 1;
            while (l != 0 || r != n - 1) {
                if (l - 1 >= 0) {
                    --l;
                    ++count[str[l] - 'a'];
                }
                if (r + 1 < n - 1) {
                    ++r;
                    if (count[str[r] - 'a'] > 0) {
                        max += 2;
                        --count[str[r] - 'a'];
                    }
                }
                System.out.println("l is "+l+" r is "+r);
            }
            res = Math.max(res, max);
            count = new int[26];

            l = i + 1;
            r = i - 1;
            max = 0;
            while (l != 0 || r != n - 1) {
                if (l - 1 >= 0) {
                    --l;
                    ++count[str[l] - 'a'];
                }
                if (r + 1 < n - 1) {
                    ++r;
                    if (count[str[r] - 'a'] > 0) {
                        max += 2;
                        --count[str[r] - 'a'];
                    }
                }
                System.out.println("l is "+l+" r is "+r);
            }
            res = Math.max(res, max);
        }
        return res;
    }
}