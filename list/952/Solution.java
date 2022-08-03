public class Solution {
    private final int N = 100_001;
    private final int[] p = new int[N];
    private final int[] count = new int[N];

    public int largestComponentSize(int[] nums) {
        for (int i = 0; i < N; i++) {
            p[i] = i;
        }
        for (int v : nums) {
            for (int i = 2; i <= v / i; i++) {
                if (v % i == 0) {
                    merge(v, i);
                    if (i != v / i) {
                        merge(v, v / i);
                    }
                }
            }
        }
        int res = 1;
        for (int v : nums) {
            res = Math.max(res, ++count[find(v)]);
        }
        return res;
    }

    private int find(int x) {
        return p[x] != x ? p[x] = find(p[x]) : p[x];
    }

    private void merge(int x, int y) {
        p[find(x)] = find(y);
    }
}
