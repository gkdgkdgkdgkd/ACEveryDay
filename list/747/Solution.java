public class Solution {
    public int dominantIndex(int[] nums) {
        int max1 = -1;
        int max2 = -1;
        int n = nums.length;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                index = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return max1 >= (max2 << 1) ? index : -1;
    }
}