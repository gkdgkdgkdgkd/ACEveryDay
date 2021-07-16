public class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (nums[m] == target) {
                int times = 1;
                for (int i = m - 1; i >= 0 && nums[i] == target; --i) {
                    ++times;
                }

                for (int i = m + 1; i < n && nums[i] == target; i++) {
                    ++times;
                }
                return times;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if(nums[l] == target){
            int times = 1;
            for (int i = l - 1; i >= 0 && nums[i] == target; --i) {
                ++times;
            }

            for (int i = l + 1; i < n && nums[i] == target; i++) {
                ++times;
            }
            return times;
        }
        return 0;
    }
}