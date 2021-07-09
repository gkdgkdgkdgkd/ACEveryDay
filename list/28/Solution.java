import java.util.Arrays;
import java.util.Locale;

public class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if(nLen == 0){
            return 0;
        }
        haystack = " " + haystack;
        needle = " " + needle;

        char[] s = haystack.toCharArray();
        char[] p = needle.toCharArray();
        int [] next = new int[nLen+1];

        for (int i = 2,j = 0; i <= nLen; i++) {
            while (j > 0 && p[i] != p[j+1]){
                j = next[j];
            }
            if(p[i] == p[j+1]){
                ++j;
            }
            next[i] = j;
        }

        for (int i = 1,j=0; i <= hLen; i++) {
            while(j>0 && s[i] != p[j+1]){
                j = next[j];
            }
            if(s[i] == p[j+1]){
                ++j;
            }
            if(j == nLen){
                return i - nLen;
            }
        }
        return -1;
    }
}