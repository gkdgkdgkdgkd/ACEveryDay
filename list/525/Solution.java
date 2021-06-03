import java.util.Arrays;

public class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0;
        int n = nums.length;
        int mapLen = (n<<1) + 1;
        int [] map = new int[mapLen];
        for (int i = 0; i < mapLen; i++) {
            map[i] = -n;
        }
        int count = n;
        map[n] = -1;
        for (int i = 0; i < n; i++) {
            count += (nums[i] == 1 ? 1 : -1);
            if(map[count] != -n){
                res = Math.max(res,i - map[count]);
            }else{
                map[count] = i;
            }
        }
        return res;
    }
}