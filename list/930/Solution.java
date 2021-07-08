public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int [] pre = new int[nums.length+1];
        pre[0] = 1;
        int sum = 0;
        int res = 0;
        for (int num:nums){
            sum += num;
            if(sum >= goal){
                res += pre[sum-goal];
            }
            ++pre[sum];
        }
        return res;
    }
}