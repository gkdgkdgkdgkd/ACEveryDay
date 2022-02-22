public class Solution {
    public String reverseOnlyLetters(String s) {
        char []c = s.toCharArray();
        int l = 0;
        int r = c.length - 1;
        while (l<r){
            while (l<r && !Character.isLetter(c[l])){
                ++l;
            }
            while (l<r && !Character.isLetter(c[r])){
                --r;
            }
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            ++l;
            --r;
        }
        return new String(c);
    }
}