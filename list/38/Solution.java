public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                int count = 1;
                char ch = str.charAt(j);
                int k;
                for (k = j + 1; k < len && str.charAt(k) == ch; k++) {
                    ++count;
                }
                builder.append(count);
                builder.append(ch);
                j = k - 1;
            }
            str = builder.toString();
        }
        return str;
    }
}