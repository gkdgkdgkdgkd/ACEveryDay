import java.util.*;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return List.of(nums[0]);
        }
        Arrays.sort(nums);
        int [] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        int last = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; nums[j]*2L <= nums[i]; j++) {
                if(nums[i] % nums[j] == 0){
                    dp[i] = Math.max(dp[i],dp[j]);
                }
            }
            ++dp[i];
            if(dp[i] > max){
                max = dp[i];
                last = i;
            }
        }
        List<Integer> ans = new ArrayList<>(max);
        for (int i = last; i >= 0; --i) {
            if(dp[i] == max && nums[last] % nums[i] == 0){
                ans.add(nums[i]);
                --max;
                last = i;
            }
        }
        return ans;
    }
}