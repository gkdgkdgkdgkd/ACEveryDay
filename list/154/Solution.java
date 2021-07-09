import java.util.*;

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            int m = (l+r)/2;
            if(nums[m] > nums[r]){
                l = m+1;
            }else if(nums[m] < nums[r]){
                r = m;
            }else{
                --r;
            }
        }
        return nums[l];
    }
}