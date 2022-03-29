public class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] c = answerKey.toCharArray();
        int n = c.length;
        if (k >= (n >> 1)) {
            return n;
        }
        int max = 0;
        int l = 0;
        int[] count = new int[2];
        for (int r = 0; r < n; r++) {
            int index = c[r] == 'T' ? 0 : 1;
            max = Math.max(max, ++count[index]);
            while (r + 1 - l - max > k) {
                --count[c[l] == 'T' ? 0 : 1];
                ++l;
            }
        }
        return n - l;
    }
}