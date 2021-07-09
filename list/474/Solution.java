public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int total0 = 0;
        int total1 = 0;
        int len = strs.length;
        int []num0 = new int[len];
        int []num1 = new int[len];
        for (int i = 0; i < len; i++) {
            for (char c:strs[i].toCharArray()){
                if(c=='0'){
                    ++num0[i];
                }else{
                    ++num1[i];
                }
            }
            total0 += num0[i];
            total1 += num1[i];
        }

        if(total0 < m && total1 < n){
            return len;
        }
        int [][] dp = new int[m+1][n+1];
        dp[0][0] = 1;
        for (int i = 0; i < len; i++) {
            int n0 = num0[i];
            int n1 = num1[i];
            for (int j = m; j >= n0; --j) {
                for (int k = n; k >= n1; --k) {
                    int temp = dp[j-n0][k-n1];
                    if(temp != 0){
                        if(j == n0 && k == n1){
                            dp[j][k] = Math.max(dp[j][k],temp);
                        }else{
                            dp[j][k] = Math.max(dp[j][k],temp+1);
                        }
                    }
                }
            }
        }
        int max = 0;
        for (int j = m; j > 0; --j) {
            for (int k = n; k > 0; --k) {
                if(dp[j][k] > max) {
                    max = dp[j][k];
                }
            }
        }
        return max;
    }
}