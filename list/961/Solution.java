import java.util.Random;

public class Solution {
    private static final Random random = new Random();

    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        while (true) {
            int i1 = random.nextInt(n);
            int i2 = random.nextInt(n);
            if (i1 != i2 && nums[i1] == nums[i2]) {
                return nums[i1];
            }
        }
    }
}