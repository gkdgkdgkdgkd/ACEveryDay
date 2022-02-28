package utils.str;

import utils.Utils;
import utils.functioninterface.RandomDigitFunction;

import static utils.random.RandomUtils.randomInt;

public class StrUtils {
    private static final String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String buildRandomStr(int len, String str) {
        return buildRandomStr(len, str.toCharArray());
    }

    private static String buildRandomStr(int len, char... ch) {
        int chLen = ch.length;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(ch[randomInt(chLen)]);
        }
        return builder.toString();
    }

    public static String randomLowercaseStr(int len) {
        return buildRandomStr(len, lowerCaseLetter);
    }

    public static String randomUppercaseStr(int len) {
        return buildRandomStr(len, upperCaseLetter);
    }

    public static String randomLetterStr(int len) {
        return buildRandomStr(len, lowerCaseLetter + upperCaseLetter);
    }

    public static String randomStr(int len, char... ch) {
        return buildRandomStr(len, ch);
    }

    private static String buildRandomDigitStrWithFunctionalInterface(int len, RandomDigitFunction fun, int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(fun.randomDigit(start, end));
        }
        return builder.toString();
    }

    public static String randomDigitStr(int len) {
        return buildRandomDigitStrWithFunctionalInterface(len, Utils::randomInt, 0, 9);
    }

    public static String randomDigitStrWithout0(int len) {
        return buildRandomDigitStrWithFunctionalInterface(len, Utils::randomInt, 1, 9);
    }

    public static String randomDigitStr01(int len) {
        return buildRandomDigitStrWithFunctionalInterface(len, Utils::randomInt, 0, 1);
    }
}