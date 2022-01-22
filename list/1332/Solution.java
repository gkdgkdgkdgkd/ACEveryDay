public class Solution {
    public int removePalindromeSub(String s) {
        for (int l = 0, r = s.length() - 1; l < r; ++l, --r) {
            if (s.charAt(l) != s.charAt(r)) {
                return 2;
            }
        }
        return 1;
    }
}