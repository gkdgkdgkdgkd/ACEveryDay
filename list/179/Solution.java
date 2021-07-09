import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder ans = new StringBuilder();
        int n = nums.length;
        String [] num = new String[n];
        for (int i = 0; i < n; i++) {
            num[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(num,(x,y)-> (y+x).compareTo(x+y));
        if(num[0].charAt(0) == '0'){
            return "0";
        }
        for (int i = 0; i < n; i++) {
            ans.append(num[i]);
        }
        return ans.toString();
    }
}