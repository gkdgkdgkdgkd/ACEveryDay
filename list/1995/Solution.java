public class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int res = 0;
        int[] map = new int[500];
        for (int b = n - 3; b >= 1; --b) {
            for (int d = b + 2; d < n; d++) {
                ++map[nums[d] - nums[b + 1] + 100];
            }
            for (int a = 0; a < b; a++) {
                res += map[nums[a] + nums[b] + 100];
            }
        }
        return res;
    }
}