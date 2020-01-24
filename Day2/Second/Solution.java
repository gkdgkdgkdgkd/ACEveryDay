import java.util.Arrays;
public class Solution
{
    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{1,2,-3,4,-6,4,6,7,3,4},0));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int t1 = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;++i)
        {
            int left = i+1;
            int right = nums.length-1;

            while(left < right)
            {
                int t2 = nums[i]+nums[left]+nums[right];
                if(t2 == target)
                    return target;
                else if(t2 > target)
                    --right;
                else 
                    ++left;
                if(abs(t1-target) > abs(t2-target))
                {
                    t1 = t2;
                }
            }
        }
        return t1;
    }

    public int abs(int t)
    {
        return t > 0 ? t : -t;
    }
}