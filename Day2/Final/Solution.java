// import java.util.Arrays;
// import java.util.Random;
public class Solution
{
    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{1,2,-3,4,-6,4,6,7,3,4},0));
    }

    public int threeSumClosest(int[] nums, int target) {
        qs(nums,0,nums.length);
        int t1 = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;++i)
        {
            int left = i+1;
            int right = nums.length-1;
            if(left < right)
            {
                int min = nums[i] + nums[left] + nums[left+1];
                if(min > target)
                {
                    if(abs(min - target) < abs(t1 - target))
                        t1 = min;
                    continue;
                }
            }
            
            int max = nums[i] + nums[right] + nums[right-1];
            if(max < target)
            {
                if(abs(max - target) < abs(t1 - target))
                    t1 = max;
                continue;
            }

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

    public void qs(int [] nums,int l,int r)
    {
        if(l < r-1)
        {
            int t = l;
            int ll = l+1;
            int rr = r-1;
            int temp;
            while(true)
            {
                while(t < rr && nums[t] < nums[rr])
                    --rr;
                if(t < rr)
                {
                    temp = nums[rr];
                    nums[rr] = nums[t];
                    nums[t] = temp;
                    t = rr--;
                }
                else
                    break;
                while(ll < t && nums[ll] < nums[t])
                    ++ll;
                if(ll < t)
                {
                    temp = nums[ll];
                    nums[ll] = nums[t];
                    nums[t] = temp;
                    t = ll++;
                }
                else
                    break;
            }
            qs(nums,l,t);
            qs(nums,t+1,r);
        }
    }
}