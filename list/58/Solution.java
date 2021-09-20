public class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int start = n - 1;
        while (s.charAt(start) == ' ') {
            --start;
        }
        n = start + 1;
        while (start >= 0 && s.charAt(start) != ' ') {
            --start;
        }
        return n - start - 1;
    }
}