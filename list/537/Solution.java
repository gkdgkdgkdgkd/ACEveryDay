public class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] a = convert(num1.toCharArray());
        int[] b = convert(num2.toCharArray());
        return toBuilder(a[0] * b[0] - a[1] * b[1]).append('+').append(toBuilder(a[0] * b[1] + a[1] * b[0])).append('i').toString();
    }

    private int[] convert(char[] c) {
        int n = c.length - 1;
        for (int i = 0; i < n; i++) {
            if (c[i] == '+') {
                int a = 0;
                int pow = 1;
                boolean negative = c[0] == '-';
                for (int j = i - 1, endIndex = negative ? 1 : 0; j >= endIndex; --j) {
                    a += (c[j] - '0') * pow;
                    pow *= 10;
                }
                if (negative) {
                    a = -a;
                }

                negative = c[i + 1] == '-';
                pow = 1;
                int b = 0;
                for (int j = n - 1, endIndex = negative ? i + 2 : i + 1; j >= endIndex; --j) {
                    b += (c[j] - '0') * pow;
                    pow *= 10;
                }
                if (negative) {
                    b = -b;
                }
                return new int[]{a, b};
            }
        }
        return null;
    }

    private StringBuilder toBuilder(int v) {
        StringBuilder builder = new StringBuilder();
        if (v == 0) {
            return builder.append('0');
        }
        boolean negative = false;
        if (v < 0) {
            negative = true;
            v = -v;
        }
        while (v > 0) {
            builder.append(v % 10);
            v /= 10;
        }
        if (negative) {
            builder.append('-');
        }
        return builder.reverse();
    }
}