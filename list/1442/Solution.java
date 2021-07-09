import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countTriplets(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int[] x = new int[n + 1];
        for (int i = 0; i < n; i++) {
            x[i+1] = arr[i] ^ x[i];
        }
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (x[i] == x[k + 1]) {
                    sum += k - i;
                }
            }
        }
        return sum;
    }
}