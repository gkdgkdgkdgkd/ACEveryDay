import java.util.*;

public class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        long sum = 0;
        Map<Integer,Boolean> map = new HashMap<>();
        for (int num:nums){
            if(map.containsKey(num)){
                sum -= num;
            }else{
                map.put(num,true);
                sum += num* 2L;
            }
        }
        return (int)(sum/2);
    }
}