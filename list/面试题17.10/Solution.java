public class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        for(int v:nums){
            if(count == 0){
                res = v;
                count = 1;
            }else if(res == v){
                ++count;
            }else {
                --count;
            }
        }

        count = 0;
        for(int v:nums){
            if(v == res){
                ++count;
            }
        }
        return count > nums.length/2 ? res : -1;
    }
}