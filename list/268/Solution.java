public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int v : nums) {
            sum += v;
        }
        return ((n * (n + 1)) >> 1) - sum;
    }
}