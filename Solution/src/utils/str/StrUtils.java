package utils.str;

import static utils.random.RandomUtils.randomInt;

public class StrUtils {
    private static final String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";

    public static String randomStr(int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(lowerCaseLetter.charAt(randomInt(Integer.MAX_VALUE) % 26));
        }
        return builder.toString();
    }

    public static String randomStr(int len, char... ch) {
        int chLen = ch.length;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(ch[randomInt(chLen)]);
        }
        return builder.toString();
    }

    public static String randomDigitStr(int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(randomInt(10));
        }
        return builder.toString();
    }

    public static String randomDigitStrWithout0(int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(randomInt(1, 9));
        }
        return builder.toString();
    }

    public static String randomDigitStr01(int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(randomInt(2));
        }
        return builder.toString();
    }
}