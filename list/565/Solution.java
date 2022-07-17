public class Solution {
    public int arrayNesting(int[] nums) {
        int res = 0;
        for (int i = 0, n = nums.length; i < n; i++) {
            int count = 0;
            while (nums[i] != -1) {
                int temp = nums[i];
                nums[i] = -1;
                i = temp;
                ++count;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}