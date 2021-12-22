public class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int res = 0;
        int bLen = b.length();
        while (builder.length() < bLen) {
            builder.append(a);
            ++res;
        }
        builder.append(a);
        int index = builder.indexOf(b);
        if (index == -1) {
            return -1;
        }
        return res + (index + bLen > a.length() * res ? 1 : 0);
    }
}