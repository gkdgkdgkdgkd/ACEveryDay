import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return n;
        }
        int slow = 0;
        for (int i = 1; i < n; i++) {
            while(i<n && nums[i] == nums[slow]){
                ++i;
            }
            if(i < n){
                nums[++slow] = nums[i];
            }
            --i;
        }
        return slow+1;
    }
}