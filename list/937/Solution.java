import java.util.Arrays;

public class Solution {
    public String[] reorderLogFiles(String[] logs) {
        int n = logs.length;
        String[] alpha = new String[n];
        int[] digit = new int[n];
        int digitLen = 0;
        int alphaLen = 0;
        for (int i = 0; i < n; i++) {
            String str = logs[i];
            char first = str.charAt(str.indexOf(" ") + 1);
            if (first >= '0' && first <= '9') {
                digit[digitLen++] = i;
            } else {
                alpha[alphaLen++] = str;
            }
        }
        Arrays.sort(alpha, 0, alphaLen, (str1, str2) -> {
            String alpha1 = str1.substring(str1.indexOf(" ") + 1);
            String alpha2 = str2.substring(str2.indexOf(" ") + 1);
            return alpha1.equals(alpha2) ? str1.compareTo(str2) : alpha1.compareTo(alpha2);
        });
        String[] res = new String[n];
        int index = 0;
        for (; index < alphaLen; ++index) {
            res[index] = alpha[index];
        }
        for (int i = 0; i < digitLen; i++) {
            res[index++] = logs[digit[i]];
        }
        return res;
    }
}