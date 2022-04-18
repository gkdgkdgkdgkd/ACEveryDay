public class Solution {
    public int[] shortestToChar(String s, char c) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] res = new int[n];
        int i = 0;
        while (i < n && ch[i] != c) {
            ++i;
        }
        int pre = i;
        for (int j = 0; j < i; j++) {
            res[j] = i - j;
        }
        for (; i < n; i++) {
            if (ch[i] == c) {
                res[i] = 0;
            } else {
                int last = i++;
                while (i < n && ch[i] != c) {
                    ++i;
                }
                if (i < n) {
                    while (last < i) {
                        res[last] = Math.min(Math.abs(i - last), Math.abs(last - pre));
                        ++last;
                    }
                } else {
                    while (last < i) {
                        res[last] = last - pre;
                        ++last;
                    }
                }
            }
            pre = i;
        }
        return res;
    }
}