public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                ++count[c - 'A'];
            } else if (c >= 'a' && c <= 'z') {
                ++count[c - 'a'];
            }
        }
        String res = "";
        int resLen = Integer.MAX_VALUE;
        for (String str : words) {
            int[] temp = new int[26];
            for (char c : str.toCharArray()) {
                ++temp[c - 'a'];
            }
            int i = 0;
            while (i < 26) {
                if (temp[i] < count[i]) {
                    break;
                }
                ++i;
            }
            int len = str.length();
            if (i >= 26 && len < resLen) {
                res = str;
                resLen = len;
            }
        }
        return res;
    }
}