import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
        if(nums == null || nums.length < 4)
            return result;
        Arrays.sort(nums);
        int len = nums.length;
        if(nums[0] + nums[1] + nums[2] + nums[3] >  target || nums[len-4] + nums[len-3] + nums[len-2] + nums[len-1] < target)
            return result;
        for(int i=0;i<len-3;++i)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target)
                break;
            if(nums[i] + nums[len-3] + nums[len-2] + nums[len-1] < target)
                continue;
            for(int j=i+1;j<len-2;++j)
            {
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int m = nums[i] + nums[j];
                int left = j+1;
                int right = len-1;
                if(m + nums[left] + nums[left+1] > target)
                    continue;
                if (m + nums[right-1] + nums[right] < target)
                    continue;
                while(left < right)
                {
                    int temp = m + nums[left] + nums[right];
                    if(temp == target)
                    {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left++], nums[right--]));
                        while(left < right && nums[left] == nums[left-1])
                            ++left;
                        while(left < right && nums[right] == nums[right+1]) 
                            --right;
                    }
                    else if(temp > target)
                        --right;
                    else
                        ++left;
                }
            }
        }
        return result;
    }
}