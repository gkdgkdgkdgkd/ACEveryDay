import java.util.Arrays;

public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0],nums[1]);
        }
        if(n == 3) {
            return Math.max(Math.max(nums[0],nums[1]),nums[2]);
        }
        if(n == 4){
            return Math.max(nums[0]+nums[2],nums[1]+nums[3]);
        }

        int [] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[2] + nums[0];
        dp[3] = nums[3] + Math.max(nums[0],nums[1]);
        for (int i = 4; i < n-1; i++) {
            int max = dp[0] + nums[i];
            for (int j = 1; j < i-1; j++) {
                if(dp[j] + nums[i] > max){
                    max = dp[j]+nums[i];
                }
            }
            dp[i] = max;
        }
        System.out.println(Arrays.toString(dp));
        int maxV = Arrays.stream(dp).max().getAsInt();
        Arrays.fill(dp,0);
        dp[0] = 0;
        dp[1] = nums[1];
        dp[2] = nums[2];
        dp[3] = nums[3] + nums[1];
        for (int i = 4; i < n; i++) {
            int max = dp[1] + nums[i];
            for (int j = 2; j < i - 1; j++) {
                if (dp[j] + nums[i] > max) {
                    max = dp[j] + nums[i];
                }
            }
            dp[i] = max;
        }
        System.out.println(Arrays.toString(dp));
        int temp = Arrays.stream(dp).max().getAsInt();
        if(temp > maxV){
            maxV = temp;
        }
        return maxV;
    }
}