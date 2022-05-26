public class Solution {
    public int findClosest(String[] words, String word1, String word2) {
        int res = Integer.MAX_VALUE;
        for (int p1 = 0, p2 = 0, n = words.length; p1 < n && p2 < n; ) {
            while (!words[p1].equals(word1)) {
                ++p1;
                if (p1 > n - 2) {
                    return res;
                }
            }
            while (p2 < n - 1 && !words[p2].equals(word2)) {
                ++p2;
                if (p2 > n - 2) {
                    return res;
                }
            }
            if (p1 < p2) {
                res = Math.min(res, p2 - p1);
                ++p1;
            } else {
                res = Math.min(res, p1 - p2);
                ++p2;
            }
            if (res == 1) {
                return 1;
            }
        }
        return res;
    }
}