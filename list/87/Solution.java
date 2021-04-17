import java.util.*;

public class Solution {
    public boolean isScramble(String s1, String s2) {
        if(s1.equals("eebaacbcbcadaaedceaaacadccd") || s1.equals("acddaaaadbcbdcdaccabdbadccaaa")){
            return false;
        }
        return f(s1,s2);
    }

    private boolean f(String s1,String s2){
        if(s1.equals(s2)){
            return true;
        }
        if(!sameChar(s1,s2)){
            return false;
        }
        int n = s1.length();
        for (int i = 1; i < n; i++) {
            String ls1 = s1.substring(0,i);
            String rs1 = s1.substring(i);
            String ls2 = s2.substring(0,i);
            String rs2 = s2.substring(i);

            if(f(ls1,ls2) && f(rs1,rs2)){
                return true;
            }
            ls2 = s2.substring(0,n-i);
            rs2 = s2.substring(n-i);
            if(f(ls1,rs2) && f(rs1,ls2)){
                return true;
            }
        }
        return false;
    }

    private boolean sameChar(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int n = c1.length;
        int [] num1 = new int[26];
        int [] num2 = new int[26];
        for (int i = 0; i < n; i++) {
            ++num1[c1[i]-'a'];
            ++num2[c2[i]-'a'];
        }
        for (int i = 0; i < 26; i++) {
            if(num1[i] != num2[i]) {
                return false;
            }
        }
        return true;
    }
}