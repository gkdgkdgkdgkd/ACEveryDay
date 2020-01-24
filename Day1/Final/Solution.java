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

    public static List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 3 && nums[0] + nums[1] + nums[2] == 0)
            result.add(Arrays.asList(nums[0], nums[1], nums[2]));
        else if (nums.length > 3) 
        {
            Arrays.sort(nums);
            Set<List<Integer>> resultSet = new HashSet<>();
            for (int i = 0; i < nums.length - 2 && nums[i] <= 0; ++i) 
            {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) 
                {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) 
                    {
                        if (!resultSet.contains(Arrays.asList(nums[i], nums[left], nums[right]))) 
                            resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        --right;
                        ++left;
                    } 
                    else if (sum > 0)
                        --right;
                    else
                        ++left;
                }
            }
            result.addAll(resultSet);
        }
        return result;
    }
}