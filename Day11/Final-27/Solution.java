import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int [] nums = new int []{ 0, 0, 1, 1, 1, 2,0,0,0, 1,1,1,0,0,0,2,3,3,2,2,2, 3, 3, 4};
        int l = new Solution().removeElement(nums,0);
        for(int i=0;i<l;++i)
            System.out.print(nums[i]+" ");
        System.out.println();
    }

    public int removeElement(int[] nums, int val) 
    {
        int index = -1;
        for (int i = 0; i < nums.length; ++i) 
        {
            if(nums[i] != val)
            {
                if (i > ++index)
                    nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}