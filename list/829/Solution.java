public class Solution {
    public int consecutiveNumbersSum(int n) {
        int res = 0;
        n <<= 1;
        for (int k = 1; k * k < n; k++) {
            if (n % k == 0 && ((n / k - k + 1) & 1) == 0) {
                ++res;
            }
        }
        return res;
    }
}