import java.util.*;

public class Solution {
    long size;
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        Map<Long,Long> map = new HashMap<>();
        size = t+1L;
        for (int i = 0; i < n; i++) {
            long u = nums[i];
            long idx = getId(u);
            if(map.containsKey(idx)){
                return true;
            }
            long l = idx-1;
            long r = idx+1;
            if(map.containsKey(l) && u-map.get(l) <= t){
                return true;
            }
            if(map.containsKey(r) && map.get(r)-u <= t){
                return true;
            }
            map.put(idx,u);
            if(i >= k){
                map.remove(getId(nums[i-k]));
            }
        }
        return false;
    }

    private long getId(long u){
        return u >= 0 ? u/size : (u+1)/size - 1;
    }
}