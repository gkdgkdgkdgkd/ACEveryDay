import java.util.*;

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int l = 0;
        int r = n-1;
        int m = (l+r)/2;
        while(l<r){
            if(nums[m] > nums[r]){
                l = m+1;
            }else{
                r = m;
            }
            m = (l+r)/2;
        }
        return nums[l];
    }
}