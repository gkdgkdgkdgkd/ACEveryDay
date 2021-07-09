public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while (columnNumber != 0) {
            --columnNumber;
            builder.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return builder.reverse().toString();
    }

    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int base = 1;
        for (int i = columnTitle.length() - 1; i >= 0; --i) {
            sum += (columnTitle.charAt(i) - 'A' + 1) * base;
            base *= 26;
        }
        return sum;
    }
}