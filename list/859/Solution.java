public class Solution {
    public boolean buddyStrings(String s, String goal) {
        int len = s.length();
        if (len != goal.length()) {
            return false;
        }
        boolean hasSameChar = false;
        int firstIndex = -1;
        int secondIndex = -1;
        int startIndex = 0;
        char[] c1 = s.toCharArray();
        char[] c2 = goal.toCharArray();
        if (len > 26) {
            hasSameChar = true;
        } else {
            boolean[] set = new boolean[26];
            for (int i = 0; i < len; i++) {
                if (c1[i] != c2[i]) {
                    if (firstIndex == -1) {
                        firstIndex = i;
                    } else if (secondIndex == -1) {
                        secondIndex = i;
                    } else {
                        return false;
                    }
                }
                if (!set[c1[i] - 'a']) {
                    set[c1[i] - 'a'] = true;
                } else {
                    hasSameChar = true;
                }
            }
            startIndex = len;
        }
        for (int i = startIndex; i < len; i++) {
            if (c1[i] != c2[i]) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                } else {
                    return false;
                }
            }
        }
        if (firstIndex == -1) {
            return hasSameChar;
        }
        if (secondIndex == -1) {
            return false;
        }
        return c2[firstIndex] == c1[secondIndex] && c2[secondIndex] == c1[firstIndex];
    }
}