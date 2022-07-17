import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 1, n = arr.length, min = Integer.MAX_VALUE; i < n; i++) {
            if (arr[i] - arr[i - 1] < min) {
                min = arr[i] - arr[i - 1];
                res.clear();
                res.add(List.of(arr[i - 1], arr[i]));
            } else if (arr[i] - arr[i - 1] == min) {
                res.add(List.of(arr[i - 1], arr[i]));
            }
        }
        return res;
    }
}
