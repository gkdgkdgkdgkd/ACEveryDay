public class Solution {
    public String fractionAddition(String expression) {
        int commonDenominator = 7560;
        int res = 0;
        char[] c = expression.toCharArray();
        for (int i = 0, n = expression.length(); i < n; ) {
            int sign = 1;
            if (c[i] == '+') {
                ++i;
            } else if (c[i] == '-') {
                sign = -1;
                ++i;
            }
            int numerator = c[i++] - '0';
            if (c[i] == '0') {
                numerator = 10;
                ++i;
            }
            ++i;
            int denominator = c[i++] - '0';
            if (i < n && c[i] == '0') {
                denominator = 10;
                ++i;
            }
            if (numerator != 0) {
                res += (commonDenominator / denominator) * numerator * sign;
            }
        }
        if (res == 0) {
            return "0/1";
        }
        StringBuilder builder = new StringBuilder();
        if (res < 0) {
            builder.append("-");
        }
        int gcdNum = gcd(res = Math.abs(res), commonDenominator);
        builder.append(res / gcdNum);
        builder.append('/');
        builder.append(commonDenominator / gcdNum);
        return builder.toString();
    }

    public int gcd(int a, int b) {
        int c;
        while ((c = a % b) > 0) {
            a = b;
            b = c;
        }
        return b;
    }
}