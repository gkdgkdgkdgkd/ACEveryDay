public class Solution {
    public String optimalDivision(int[] nums) {
        StringBuilder builder = new StringBuilder();
        builder.append(nums[0]);
        int n = nums.length;
        if (n < 3) {
            return n < 2 ? builder.toString() : builder.append('/').append(nums[1]).toString();
        }
        builder.append("/(");
        for (int i = 1; i < n - 1; i++) {
            builder.append(nums[i]).append('/');
        }
        builder.append(nums[n - 1]).append(')');
        return builder.toString();
    }
}