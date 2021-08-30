public class Solution {
    public int compress(char[] chars) {
        StringBuilder builder = new StringBuilder();
        int n = chars.length;
        for (int i = 0; i < n; ) {
            char c = chars[i];
            int num = 1;
            for (++i; i < n && chars[i] == c; ++i) {
                ++num;
            }
            builder.append(c);
            if (num != 1) {
                builder.append(num);
            }
        }
        n = builder.length();
        for (int i = 0; i < n; i++) {
            chars[i] = builder.charAt(i);
        }
        return n;
    }
}