public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for (int l = 0, r = nums.length - 1; l < r; ) {
            while (l < r && (nums[l] & 1) == 0) {
                ++l;
            }
            while (l < r && (nums[r] & 1) == 1) {
                --r;
            }
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return nums;
    }
}