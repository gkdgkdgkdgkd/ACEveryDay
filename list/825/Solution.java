public class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        int[] sum = new int[121];
        for (int v : ages) {
            ++count[v];
        }
        sum[0] = count[0];
        for (int i = 1; i <= 120; i++) {
            sum[i] = sum[i - 1] + count[i];
        }
        int res = 0;
        for (int i = 15; i <= 120; i++) {
            res += count[i] * (sum[i] - sum[(i >> 1) + 7] - 1);
        }
        return res;
    }
}