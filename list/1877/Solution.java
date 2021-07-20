public class Solution {
    public int minPairSum(int[] nums) {
        int [] count = new int[100_000+1];
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int v:nums){
            ++count[v];
            if(v > max) {
                max = v;
            }
        }
        int index = 0;
        for (int i = 1; i <= max; i++) {
            int c = count[i];
            for (int j = 0; j < c; j++) {
                nums[index++] = i;
            }
            if(index >= n){
                break;
            }
        }
        max = Integer.MIN_VALUE;
        for (int i = 0; i < (n>>1); i++) {
            int tempSum = nums[i] + nums[n - i - 1];
            if(tempSum > max){
                max = tempSum;
            }
        }
        return max;
    }
}