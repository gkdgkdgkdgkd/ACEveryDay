import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int [] nums = new int []{ 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int l = new Solution().removeDuplicates(nums);
        for(int i=0;i<l;++i)
            System.out.print(nums[i]+" ");
        System.out.println();
    }

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=1;i<nums.length;++i)
        {
            if(nums[i] > nums[index])
            {
                if(i > ++index)
                    nums[index] = nums[i];
            }
        }
        return index+1;
    }
}