public class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        final int shift = 20_000;
        int[] map = new int[40_001];
        int res = 0;
        for (int v : arr) {
            int val = map[v - difference + shift];
            map[v + shift] = ++val;
            res = Math.max(res, val);
        }
        return res;
    }
}