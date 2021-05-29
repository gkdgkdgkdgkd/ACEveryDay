import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] sum = new int[m];
            for (int j = i; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    sum[k] += matrix[j][k];
                }
                count += subSum(sum,target);
            }
        }
        return count;
    }

    private int subSum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int pre = 0;
        for (int x : nums) {
            pre += x;
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}