import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2){
            return n;
        }
        int s = 2;
        for (int f = 2; f < n; ++f) {
            if(nums[f] != nums[s-2]){
                nums[s++] = nums[f];
            }
        }
        return s;
    }
}