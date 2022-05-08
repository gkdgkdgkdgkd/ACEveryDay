import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int v : nums) {
            nums[(v - 1) % n] += n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > (n << 1)) {
                res.add(i + 1);
            }
        }
        return res;
    }
}