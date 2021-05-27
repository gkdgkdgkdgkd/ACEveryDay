public class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < 32; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                c += (nums[j] >> i) & 1;
            }
            sum += c * (n-c);
        }
        return sum;
    }
}