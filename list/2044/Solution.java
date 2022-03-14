public class Solution {
    private int[] nums;
    private int n;
    private int max;
    private int count;

    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        for (int v : nums) {
            max |= v;
        }
        dfs(0, 0);
        return count;
    }

    private void dfs(int i, int res) {
        if (res == max) {
            count += 1 << (n - i);
            return;
        }
        for (int j = i; j < n; j++) {
            dfs(j + 1, res | nums[j]);
        }
    }
}