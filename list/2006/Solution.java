public class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] map = new int[301];
        final int SHIFT = 100;
        int res = 0;
        for (int v : nums) {
            res += map[v + k + SHIFT] + map[v - k + SHIFT];
            ++map[v + SHIFT];
        }
        return res;
    }
}