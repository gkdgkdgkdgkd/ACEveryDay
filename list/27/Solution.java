public class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] != val) {
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }
}