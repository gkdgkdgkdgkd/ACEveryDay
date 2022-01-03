public class Solution {
    private static final int[] dayPrefixSum = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    private static final String[] res = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public String dayOfTheWeek(int day, int month, int year) {
        int sum = 0;
        for (int i = 1971; i < year; i++) {
            sum += 365 + (isLeapYear(i) ? 1 : 0);
        }
        sum += dayPrefixSum[month - 1] + day;
        if (month > 2 && isLeapYear(year)) {
            ++sum;
        }
        return res[(sum + 4) % 7];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}