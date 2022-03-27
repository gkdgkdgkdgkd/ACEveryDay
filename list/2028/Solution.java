public class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        int m = rolls.length;
        for (int v : rolls) {
            sum += v;
        }
        int total = (m + n) * mean;
        if (sum + n > total || sum + n * 6 < total) {
            return new int[]{};
        }
        int diff = total - sum;
        int base = diff / n;
        int mod = diff % n;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = base;
            if (mod > 0) {
                ++res[i];
                --mod;
            }
        }
        return res;
    }
}