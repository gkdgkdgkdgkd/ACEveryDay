public class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            while (l < r && find(c[l])){
                ++l;
            }

            while (l < r && find(c[r])){
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

    private boolean find(char ch){
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U';
    }
}