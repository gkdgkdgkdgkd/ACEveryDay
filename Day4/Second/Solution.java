import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int target = 0;
        for (List<Integer> t : new Solution().fourSum(new int[] { -4,-3,-2,-1,0,0,1,2,3,4 },target)) {
            System.out.println(t.get(0) + "+" + t.get(1) + "+" + t.get(2) + "+" +t.get(3) + "=" + target);
        }
    }

    public List<List<Integer>> fourSum(int[] nums,int target) 
    {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 4 && nums[0] + nums[1] + nums[2] + nums[3] == target)
            result.add(Arrays.asList(nums[0], nums[1], nums[2],nums[3]));
        else if (nums.length > 4) 
        {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-3;++i)
            {
                for(int j=i+1;j<nums.length-2;++j)
                {
                    int m = nums[i] + nums[j];
                    int left = j+1;
                    int right = nums.length-1;
                    if(m + nums[left] + nums[left+1] > target)
                        continue;
                    if (m + nums[right-1] + nums[right] < target)
                        continue;
                    while(left < right)
                    {
                        int temp = m + nums[left] + nums[right];
                        if(temp == target)
                        {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            --right;
                            ++left;
                        }
                        else if(temp > target)
                            --right;
                        else
                            ++left;
                    }
                }
            }
            return result.stream().distinct().collect(Collectors.toList());
        }
        return result;
    }
}