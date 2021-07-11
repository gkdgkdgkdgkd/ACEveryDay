import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (r + l) >> 1;
            if (citations[m] == n - m) {
                return n - m;
            }
            if (citations[m] < n - m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return n - l;
    }
}