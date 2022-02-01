public class Solution {
    public String longestNiceSubstring(String s) {
        return find(0, s.length() - 1, s.toCharArray());
    }

    private String find(int l, int r, char[] c) {
        int lowercase = 0;
        int uppercase = 0;
        for (int i = l; i <= r; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                lowercase |= (1 << (c[i] - 'a'));
            } else {
                uppercase |= (1 << (c[i] - 'A'));
            }
        }
        int checkRes = -1;
        for (int i = 0; i < 26; i++) {
            if ((lowercase & (1 << i)) != (uppercase & (1 << i))) {
                checkRes = i;
                break;
            }
        }
        if (checkRes == -1) {
            return new String(c, l, r - l + 1);
        }
        for (int i = l; i <= r; i++) {
            if (c[i] == ('a' + checkRes) || c[i] == ('A' + checkRes)) {
                String lStr = find(l, i - 1, c);
                String rStr = find(i + 1, r, c);
                return rStr.length() > lStr.length() ? rStr : lStr;
            }
        }
        return "";
    }
}