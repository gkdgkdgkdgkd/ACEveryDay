public class Solution {
    private static final int[] months = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    public int dayOfYear(String date) {
        int year = (date.charAt(0) - '0') * 1000 + (date.charAt(1) - '0') * 100 + (date.charAt(2) - '0') * 10 + (date.charAt(3) - '0');
        int month = (date.charAt(5) - '0') * 10 + (date.charAt(6) - '0');
        int day = (date.charAt(8) - '0') * 10 + (date.charAt(9) - '0');
        int res = months[month - 1] + day;
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month > 2) {
            ++res;
        }
        return res;
    }
}