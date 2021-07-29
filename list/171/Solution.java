public class Solution {
    public int titleToNumber(String columnTitle) {
        int base = 1;
        char[] ch = columnTitle.toCharArray();
        int sum = 0;
        for (int i = ch.length-1; i >= 0; --i) {
            sum += (ch[i] - 'A' + 1) * base;
            base *= 26;
        }
        return sum;
    }
}