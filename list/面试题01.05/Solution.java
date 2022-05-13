public class Solution {
    public boolean oneEditAway(String first, String second) {
        int firstLen = first.length();
        int secondLen = second.length();
        if (Math.abs(firstLen - secondLen) > 1) {
            return false;
        }
        char[] c1 = first.toCharArray();
        char[] c2 = second.toCharArray();
        boolean hasDifferent = false;
        for (int p1 = 0, p2 = 0; p1 < firstLen && p2 < secondLen; ++p1, ++p2) {
            if (c1[p1] != c2[p2]) {
                if (hasDifferent) {
                    return false;
                }
                hasDifferent = true;
                if (firstLen > secondLen) {
                    --p2;
                } else if (firstLen < secondLen) {
                    --p1;
                }
            }
        }
        return true;
    }
}