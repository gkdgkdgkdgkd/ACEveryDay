public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int v:nums){
            if(v+sum < v){
                sum = v;
            }else{
                sum += v;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}