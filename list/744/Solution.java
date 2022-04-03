public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(target >= letters[n-1]){
            return letters[0];
        }
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (letters[m] > target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return letters[l];
    }
}