public class Solution {
    public String getHint(String secret, String guess) {
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        int n = s.length;
        int[] sCount = new int[10];
        int[] gCount = new int[10];
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == g[i]) {
                ++bulls;
            } else {
                ++sCount[s[i] - '0'];
                ++gCount[g[i] - '0'];
            }
        }
        for (int i = 0; i < 10; i++) {
            cows += Math.min(sCount[i], gCount[i]);
        }
        return new StringBuilder().append(bulls).append("A").append(cows).append("B").toString();
    }
}