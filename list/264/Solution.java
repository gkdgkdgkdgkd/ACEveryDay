import java.util.Arrays;

public class Solution {
    public int nthUglyNumber(int n) {
        int [] dp = new int[n+1];
        dp[1] = 1;
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        for (int t = 2; t <= n;++t ) {
            int a = dp[p2] * 2;
            int b = dp[p3] * 3;
            int c = dp[p5] * 5;
            dp[t] = Math.min(Math.min(a,b),c);
            if(dp[t] == a){
                ++p2;
            }
            if(dp[t] == b){
                ++p3;
            }
            if(dp[t] == c){
                ++p5;
            }
        }
        return dp[n];
    }
}