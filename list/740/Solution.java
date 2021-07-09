public class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int [] sum = new int[10002];
        int max = 0;
        for (int num:nums){
            ++sum[num];
            max = Math.max(max,num);
        }
        int first = sum[1];
        int second = Math.max(first,sum[2]*2);
        int result = Math.max(first,second);
        for (int i = 3; i <= max; i++) {
            int temp = Math.max(second,first+sum[i]*i);
            if(temp > result){
                result = temp;
            }
            first = second;
            second = temp;
        }
        return result;
    }
}