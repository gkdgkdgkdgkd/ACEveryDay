public class Solution {
    public int[] diStringMatch(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] res = new int[n + 1];
        int l = 0;
        int r = n;
        for (int i = 0; i < n; i++) {
            res[i] = ch[i] == 'I' ? l++ : r--;
        }
        res[n] = l;
        return res;
    }
}