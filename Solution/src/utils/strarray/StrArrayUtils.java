package utils.strarray;

import static utils.Utils.randomInt;

public class StrArrayUtils {
    private static final String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
    public static String[] array(String... v) {
        return v;
    }

    public static String[] randomStrArray() {
        int arrayLen = randomInt(100) + 100;
        int strLen = randomInt(100) + 100;
        String[] strs = new String[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < strLen; j++) {
                builder.append(lowerCaseLetter.charAt(randomInt(26)));
            }
            strs[i] = builder.toString();
        }
        return strs;
    }

    public static String[] randomStrArray(int arrayLen) {
        int strLen = randomInt(100) + 100;
        String[] strs = new String[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < strLen; j++) {
                builder.append(lowerCaseLetter.charAt(randomInt(26)));
            }
            strs[i] = builder.toString();
        }
        return strs;
    }

    public static String[] randomStrArray(int arrayLen, int strLen) {
        String[] strs = new String[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < strLen; j++) {
                builder.append(lowerCaseLetter.charAt(randomInt(26)));
            }
            strs[i] = builder.toString();
        }
        return strs;
    }
}