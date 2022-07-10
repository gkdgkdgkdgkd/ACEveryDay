import java.util.Arrays;

public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = (dungeon[0][0] >= 0 ? 1 : -dungeon[0][0] + 1);
        for (int i = 1; i < n; i++) {
            dp[0][i] = (dungeon[0][0] >= 0 ? dp[0][i - 1] : 1);
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (dungeon[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];

        for(int [] r:dp){
            Arrays.fill(r,Integer.MIN_VALUE);
        }

//        if(!check(grid)){
//            return 0;
//        }

        dp[0][0] = grid[0][0];

        for (int t = 1; t <= 2*n-2; t++) {
            int [][] dp2 = new int[n][n];
            for(int []r:dp2){
                Arrays.fill(r,Integer.MIN_VALUE);
            }

            for (int i = Math.max(0,t - (n-1)); i <= Math.min(n-1,t) ; i++) {
                for (int j = Math.max(0,t-(n-1)); j <= Math.min(n-1,t); j++) {
                    if(grid[i][t-i] == -1 || grid[j][t-j] == -1){
                        continue;
                    }

                    int res = grid[i][t-i];
                    if(i != j){
                        res += grid[j][t-j];
                    }

                    for (int pi = i-1;pi<=i;++pi){
                        for (int pj = j-1;pj<=j;++pj){
                            if(pi >= 0 && pj >= 0){
                                dp2[i][j] = Math.max(dp2[i][j],dp[pi][pj] + res);
                            }
                        }
                    }
                }
            }

            dp = dp2;
        }

        return Math.max(0,dp[n-1][n-1]);
    }

    private boolean check(int [][]grid){
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] reach = new boolean[m][n];
        reach[0][0] = true;
        for (int i = 1; i < m; i++) {
            if(grid[i][0] != -1){
                reach[i][0] = true;
            }else{
                break;
            }
        }

        for (int j = 1; j < n; j++) {
            if(grid[0][j] != -1) {
                reach[0][j] = true;
            }else{
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(grid[i][j] != -1 && (reach[i-1][j] || reach[i][j-1])) {
                    reach[i][j] = true;
                }
            }
        }

        return reach[m-1][n-1];
    }
}