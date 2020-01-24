public class Solution
{
    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{1,2,-3,4,-6,4,6,7,3,4},0));
    }

    public int threeSumClosest(int[] nums, int target) {
        int temp = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;++i)
            for(int j=i+1;j<nums.length;++j)
                for(int k=j+1;k<nums.length;++k)
                {
                    int temp1 = nums[i]+nums[j]+nums[k];
                    if(Math.abs(temp-target) > Math.abs(temp1-target))
                    {
                        temp = temp1;
                        if(temp == target)
                            return target;
                    }
                }
        return temp;
    }
}