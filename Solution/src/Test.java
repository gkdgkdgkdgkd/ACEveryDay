import java.util.Arrays;

public class Test {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(0, n - 1, n - k, nums);
    }

    private int quickSelect(int l, int r, int k, int[] nums) {
        int m = partition(l, r, nums);
        System.out.println("m is "+m);
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
        System.out.println("l is "+l+" r is "+r);
        if (l == r) {
            return l;
        }
        int origin = l++;
        int v = nums[origin];
        while (l < r) {
            while (l < r && nums[l] <= v) {
                ++l;
            }
            while (l < r && nums[r] >= v) {
                --r;
            }
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        System.out.println("after compare l is "+l);
        System.out.println("arr is "+ Arrays.toString(nums));
        if(nums[origin] > nums[l]) {
            System.out.println("origin is " + origin);
            System.out.println("l is " + l + " r is " + r);
            int temp = nums[l];
            nums[l] = nums[origin];
            nums[origin] = temp;
            return l;
        }
        return origin;
    }
}
