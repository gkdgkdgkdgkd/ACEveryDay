import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int target = 123;
        for (List<Integer> t : new Solution().fourSum(new int[] { 234, -34, -456, 1123, 567, 993, -349, 0, -34, 67, 5,
                6, -456, -888, -999, -123, 123, 0, 2, 992, 121 },target)) {
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
            Set<List<Integer>> resultSet = new HashSet<>();
            for(int i=0;i<nums.length-3;++i)
            {
                for(int j=i+1;j<nums.length-2;++j)
                {
                    for(int k=j+1;k<nums.length-1;++k)
                    {
                        for(int m=k+1;m<nums.length;++m)
                        {
                            if(nums[i]+nums[j]+nums[k]+nums[m] == target)
                                resultSet.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
                        }
                    }
                }
            }
            result.addAll(resultSet);
            Collections.sort(result,(t1,t2)->
            {
                if(t1.get(0) > t2.get(0))
                    return 1;
                if (t1.get(0) < t2.get(0))
                    return -1;
                if (t1.get(1) > t2.get(1))
                    return 1;
                if (t1.get(1) < t2.get(1))
                    return -1;
                if (t1.get(2) > t2.get(2))
                    return 1;
                if (t1.get(2) < t2.get(2))
                    return -1;
                if (t1.get(3) > t2.get(3))
                    return 1;
                if (t1.get(3) < t2.get(3))
                    return -1;
                return 0;
            });
        }
        return result;
    }
}