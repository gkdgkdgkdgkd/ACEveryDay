public class Solution {
    public String nearestPalindromic(String num) {
        int n = num.length();
        int half = (n >> 1) + (n & 1);
        boolean odd = (n & 1) == 1;
        long origin = convertToNum(num);
        if (origin == 1L) {
            return "0";
        }
        long m = convertToNum(num.substring(0, half));
        long middle = makePalindromicNum(m, half, odd);
        long lowerLimit = makePalindromicNum(m - 1, half, odd);
        long upperLimit = makePalindromicNum(m + 1, half, odd);
        return convertToStr(middle == origin ? minAbs(lowerLimit, upperLimit, origin) :
            (middle < origin ? minAbs(middle, upperLimit, origin) : minAbs(lowerLimit, middle, origin)));
    }

    private long minAbs(long lower, long upper, long origin) {
        return Math.abs(lower - origin) <= Math.abs(upper - origin) ? lower : upper;
    }

    private long makePalindromicNum(long m, int half, boolean odd) {
        int len = 0;
        for (long temp = m; temp > 0; temp /= 10) {
            ++len;
        }
        return half == len ? makePalindromicNum(m, odd) :
            (len > half ? makePalindromicNum((odd ? m / 10 : m), !odd) : makePalindromicNum((odd ? m : m * 10 + 9), !odd));
    }

    private long makePalindromicNum(long m, boolean odd) {
        StringBuilder builder = new StringBuilder(convertToStr(m));
        for (int i = builder.length() - 1 - (odd ? 1 : 0); i >= 0; --i) {
            builder.append(builder.charAt(i));
        }
        return convertToNum(builder.toString());
    }

    private long convertToNum(String str) {
        int n = str.length();
        long res = 0;
        for (int i = 0; i < n; ++i) {
            res *= 10;
            res += str.charAt(i) - '0';
        }
        return res;
    }

    private String convertToStr(long num) {
        StringBuilder builder = new StringBuilder();
        while (num > 0) {
            builder.append(num % 10);
            num /= 10;
        }
        return builder.reverse().toString();
    }
}