package utils.str;

import utils.random.RandomUtils;

public class StrUtils {
    private static final String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";

    public static String randomStr() {
        return randomStr(RandomUtils.randomInt(1, 100));
    }

    public static String randomStr(int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(lowerCaseLetter.charAt(RandomUtils.randomInt(Integer.MAX_VALUE) % 26));
        }
        return builder.toString();
    }
}
