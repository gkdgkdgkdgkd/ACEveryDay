public class Solution {
    public String toGoatLatin(String sentence) {
        int n = sentence.length();
        char[] res = new char[n * n];
        int index = 1;
        int cur = 0;
        char[] c = sentence.toCharArray();
        for (int i = 0; i < n; i++) {
            char first = c[i];
            first = (first >= 'A' && first <= 'Z' ? (char) ('a' + (first - 'A')) : first);
            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                while (i < n && c[i] != ' ') {
                    res[cur++] = c[i++];
                }
            } else {
                int start = i++;
                while (i < n && c[i] != ' ') {
                    res[cur++] = c[i++];
                }
                res[cur++] = c[start];
            }
            res[cur++] = 'm';
            res[cur++] = 'a';
            for (int j = 0; j < index; j++) {
                res[cur++] = 'a';
            }
            res[cur++] = ' ';
            ++index;
        }
        return new String(res, 0, cur - 1);
    }
}