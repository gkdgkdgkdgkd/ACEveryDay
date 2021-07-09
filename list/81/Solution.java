import java.util.*;

class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if(n == 1){
            return nums[0] == target;
        }
        int l = 0;
        int r = n-1;
        if(nums[l] == target || nums[r] == target){
            return true;
        }
        int m = 1;
        for(;m<n && nums[m] >= nums[m-1];++m){
            if(nums[m-1] == target){
                return true;
            }
        }
        if(m == n){
            m = (l+r) / 2;
        }
        if(nums[m] == target){
            return true;
        }
        if(nums[m] > target){
            return false;
        }
        if(nums[r] > target){
            l = m;
        }else{
            r = m;
        }
        for(m = (l+r)/2;l<r;m = (l+r)/2){
            if(nums[m] == target){
                return true;
            }
            if(nums[m] > target){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return false;
    }
}