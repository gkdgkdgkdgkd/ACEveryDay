import java.util.Random;

public class Solution {
    private final int[] nums;
    private final int n;
    private final Random random = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
    }

    public int pick(int target) {
        int count = 1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (random.nextInt(count) == 0) {
                    res = i;
                }
                ++count;
            }
        }
        return res;
    }
}