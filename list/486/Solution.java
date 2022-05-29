public class Solution {
    private static final String NEITHER = "Neither";
    private static final String IPV4 = "IPv4";
    private static final String IPV6 = "IPv6";

    public String validIPAddress(String queryIP) {
        int n = queryIP.length();
        if (n < 7 || n > 39) {
            return NEITHER;
        }
        char[] c = queryIP.toCharArray();
        if (queryIP.contains(".")) {
            if (n > 15 || c[n - 1] == '.') {
                return NEITHER;
            }
            int pointCount = 0;
            for (int i = 0; i < n; i++) {
                boolean isPrefixZero = false;
                for (int sum = 0; i < n && c[i] >= '0' && c[i] <= '9'; ++i) {
                    if (isPrefixZero) {
                        return NEITHER;
                    }
                    sum *= 10;
                    sum += (c[i] - '0');
                    if (sum == 0) {
                        isPrefixZero = true;
                    }
                    if (sum > 255) {
                        return NEITHER;
                    }
                }
                if (i < n) {
                    if (c[i] == '.' && c[i - 1] != '.') {
                        ++pointCount;
                    } else {
                        return NEITHER;
                    }
                }
            }
            return pointCount != 3 ? NEITHER : IPV4;
        } else if (queryIP.contains(":")) {
            if (n < 15 || c[n - 1] == ':') {
                return NEITHER;
            }
            int colonCount = 0;
            int lastNumLength = 0;
            for (int i = 0; i < n; i++) {
                if ((c[i] >= '0' && c[i] <= '9') || (c[i] >= 'a' && c[i] <= 'f') || (c[i] >= 'A' && c[i] <= 'F') || c[i] == ':') {
                    if (c[i] == ':') {
                        if (lastNumLength == 0) {
                            return NEITHER;
                        }
                        lastNumLength = 0;
                        ++colonCount;
                    } else if (++lastNumLength > 4) {
                        return NEITHER;
                    }
                } else {
                    return NEITHER;
                }
            }
            return colonCount != 7 ? NEITHER : IPV6;
        }
        return NEITHER;
    }
}