import java.util.*;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int n = wall.size();
        for (int i = 0; i < n; i++) {
            List<Integer> l = wall.get(i);
            int sum = 0;
            int len = l.size()-1;
            for (int j = 0; j < len; j++) {
                sum += l.get(j);
                int temp;
                map.put(sum,temp = (map.getOrDefault(sum,0)+1));
                if(temp > max){
                    max = temp;
                }
            }
        }
        return n-max;
    }
}