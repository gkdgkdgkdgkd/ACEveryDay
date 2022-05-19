import java.util.Random;

public class Solution {
    private static final Random random = new Random();

    private int quickSelect(int l, int r, int k, int[] nums) {
        int m = partition(l, r, nums);
        if (m == k) {
            return nums[m];
        }
        if (m > k) {
            return quickSelect(l, m - 1, k, nums);
        } else {
            return quickSelect(m + 1, r, k, nums);
        }
    }

    private int partition(int l, int r, int[] nums) {
        int randomIndex = random.nextInt(r - l + 1) + l;
        int temp = nums[randomIndex];
        nums[randomIndex] = nums[l];
        nums[l] = temp;
        int origin = l++;
        int v = nums[origin];
        while (l <= r) {
            while (l <= r && nums[l] <= v) {
                ++l;
            }
            while (l <= r && nums[r] >= v) {
                --r;
            }
            if (l < r) {
                temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        --l;
        temp = nums[l];
        nums[l] = nums[origin];
        nums[origin] = temp;
        return l;
    }

    public int minMoves2(int[] nums) {
        int n = nums.length;
        int target = quickSelect(0, n - 1, n >> 1, nums);
        if ((n & 1) == 0) {
            target += quickSelect(0, n - 1, (n >> 1) - 1, nums);
            target >>= 1;
        }
        int res = 0;
        for (int v : nums) {
            res += Math.abs(v - target);
        }
        return res;
    }
}