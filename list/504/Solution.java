public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        boolean negative = num < 0;
        if (negative) {
            num = -num;
        }
        while (num > 0) {
            builder.append(num % 7);
            num /= 7;
        }
        if (negative) {
            builder.append('-');
        }
        return builder.reverse().toString();
    }
}