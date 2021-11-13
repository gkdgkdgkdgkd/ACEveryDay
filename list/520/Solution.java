public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();
        int n = c.length;
        if (n == 1) {
            return true;
        }
        boolean base = checkUpperCase(c[1]);
        for (int i = 2; i < n; i++) {
            if (checkUpperCase(c[i]) != base) {
                return false;
            }
        }
        return !base || checkUpperCase(c[0]);
    }

    private boolean checkUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }
}