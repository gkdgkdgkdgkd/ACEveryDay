public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        char[] ch = s.toCharArray();
        int len = s.length();
        int resLen = len + len / k;
        char[] res = new char[resLen];
        int count = 0;
        int p = resLen - 1;
        for (int i = len - 1; i >= 0; --i) {
            if (ch[i] == '-') {
                continue;
            }
            res[p--] = Character.toUpperCase(ch[i]);
            ++count;
            if (count == k) {
                res[p--] = '-';
                count = 0;
            }
        }
        if (p < resLen - 1 && res[p + 1] == '-') {
            ++p;
        }
        return new String(res, p + 1, resLen - p - 1);
    }
}