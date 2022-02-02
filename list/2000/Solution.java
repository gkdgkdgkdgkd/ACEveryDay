public class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int len = c.length;
        int pos = 0;
        while (pos < len && c[pos] != ch) {
            ++pos;
        }
        if (pos == len) {
            return word;
        }
        for (int l = 0; l < pos; ++l, --pos) {
            char temp = c[l];
            c[l] = c[pos];
            c[pos] = temp;
        }
        return new String(c);
    }
}