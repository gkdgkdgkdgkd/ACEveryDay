import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        for (List<Integer> t : threeSum(new int[] { 1, 2, -2, -1, 0, 3 })) {
            System.out.println(t.get(0) + "+" + t.get(1) + "+" + t.get(2) + "=0");
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length <= 2)
            return result;
        if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                result.add(Arrays.asList(nums[0], nums[1], nums[2]));
                return result;
            }
        }
        Arrays.sort(nums);
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    --right;
                    ++left;
                } else if (sum > 0) {
                    --right;
                } else
                    ++left;
            }
        }
        result.addAll(resultSet);
        Collections.sort(result, (t1, t2) -> {
            if (t1.get(0) < t2.get(0))
                return -1;
            if (t1.get(0) > t2.get(0))
                return 1;
            if (t1.get(1) < t2.get(1))
                return -1;
            if (t1.get(1) > t2.get(1))
                return 1;
            if (t1.get(2) < t2.get(2))
                return -1;
            if (t1.get(2) > t2.get(2))
                return 1;
            return -1;
        });
        return result;
    }
}