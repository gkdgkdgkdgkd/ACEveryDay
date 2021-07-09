public class Solution {
    private char[] c;

    public boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        char[] c = s.toCharArray();
        this.c = c;
        int n = c.length;
        if (n == 0) {
            return false;
        }
        if (c[0] != '+' && c[0] != '-' && c[0] < '0' && c[0] > '9') {
            return false;
        }

        boolean alpha = false;
        boolean dot = false;
        int alphaIndex = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == '+' || c[i] == '-') {
                if (i != 0 && c[i - 1] != 'e' && c[i - 1] != 'E') {
                    return false;
                }
            } else if (c[i] == '.') {
                if (!dot) {
                    dot = true;
                } else {
                    return false;
                }
            } else if (c[i] == 'e' || c[i] == 'E') {
                if (!alpha) {
                    alpha = true;
                    alphaIndex = i;
                } else {
                    return false;
                }
            } else if (!Character.isDigit(c[i])) {
                return false;
            }
        }
        if (!alpha) {
            return isInt(0, n) || isDouble(0, n);
        }

        if (isInt(0, alphaIndex) || isDouble(0, alphaIndex)) {
            return isInt(alphaIndex + 1, n);
        }
        return false;
    }

    private boolean isInt(int start, int end) {
        if (end == start) {
            return false;
        }
        char[] c = this.c;
        if (c[start] == '+' || c[start] == '-') {
            if (end - start == 1) {
                return false;
            }
            ++start;
        }
        for (int i = start; i < end; i++) {
            if (c[i] == '.') {
                return false;
            }
        }
        return true;
    }

    private boolean isDouble(int start, int end) {
        if (end == start) {
            return false;
        }
        char[] c = this.c;
        int n = end - start;
        boolean first = false;
        if (c[0] == '+' || c[0] == '-') {
            if (end - start == 1) {
                return false;
            }
            ++start;
            first = true;
        }
        for (int i = start; i < end; i++) {
            if (c[i] == '.') {
                return n != (first ? 1 : 0) + 1;
            }
        }
        return false;
    }
}