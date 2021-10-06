public class Solution {
    public int countSegments(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            ++count;
            while (++i < n && s.charAt(i) != ' ')
                ;
        }
        return count;
    }
}