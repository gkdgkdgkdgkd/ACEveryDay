public class Solution {
    public int countDigitOne(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        if (len == 1) {
            return n > 0 ? 1 : 0;
        }
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        for (int i = 1; i < len - 1; i++) {
            prefix[i] = Integer.parseInt(s.substring(0, i));
            suffix[i] = Integer.parseInt(s.substring(i + 1));
        }
        suffix[0] = Integer.parseInt(s.substring(1));
        prefix[len - 1] = Integer.parseInt(s.substring(0, len - 1));

        int res = 0;
        for (int i = 0; i < len; i++) {
            int x = s.charAt(i) - '0';
            int suffixLen = len - i - 1;
            int temp = prefix[i] * (int) Math.pow(10, suffixLen);
            if (x == 1) {
                temp += suffix[i] + 1;
            } else if (x != 0) {
                temp += (int) Math.pow(10, suffixLen);
            }
            res += temp;
        }
        return res;
    }
}