import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] bak = Arrays.copyOf(arr, n);
        Arrays.sort(arr);
        int index = 0;
        int last = Integer.MAX_VALUE;
        for (int v : arr) {
            if (v == last) {
                continue;
            }
            map.put(last = v, ++index);
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = map.get(bak[i]);
        }
        return res;
    }
}