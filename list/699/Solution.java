import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> fallingSquares(int[][] positions) {
        int n = positions.length;
        int[] arr = new int[n];
        arr[0] = positions[0][1];
        for (int i = 1; i < n; i++) {
            int height = positions[i][1];
            int l = positions[i][0];
            int r = l + height - 1;
            for (int j = 0; j < i; j++) {
                int ll = positions[j][0];
                int rr = ll + positions[j][1] - 1;
                if (r >= ll && l <= rr) {
                    height = Math.max(height, arr[j] + positions[i][1]);
                }
            }
            arr[i] = height;
        }
        List<Integer> res = new ArrayList<>(n);
        res.add(arr[0]);
        for (int i = 1; i < n; i++) {
            res.add(Math.max(res.get(i - 1), Math.max(arr[i], arr[i - 1])));
        }
        return res;
    }
}