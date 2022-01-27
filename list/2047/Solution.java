public class Solution {
    public int countValidWords(String sentence) {
        int res = 0;
        String[] split = sentence.split(" ");
        for (String str : split) {
            int len = str.length();
            boolean hyphen = false;
            int i = 0;
            for (; i < len; ++i) {
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    continue;
                }
                if (c >= '0' && c <= '9') {
                    break;
                }
                if (c == '-') {
                    if (!hyphen) {
                        hyphen = true;
                        if (i == 0 || !Character.isLowerCase(str.charAt(i - 1)) || i == len - 1 || !Character.isLowerCase(str.charAt(i + 1))) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i != len - 1) {
                    break;
                }
            }
            if (len != 0 && i == len) {
                ++res;
            }
        }
        return res;
    }
}