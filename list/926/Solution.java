public class Solution {
    public int minFlipsMonoIncr(String s) {
        int dp0 = 0;
        int dp1 = 0;
        for (char c : s.toCharArray()) {
            dp1 = Math.min(dp1, dp0) + '1' - c;
            dp0 += c - '0';
        }
        return Math.min(dp0, dp1);
    }
}