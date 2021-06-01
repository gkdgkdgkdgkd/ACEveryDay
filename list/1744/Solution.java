public class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = queries.length;
        boolean [] res = new boolean[n];
        int m = candiesCount.length;
        long [] sum = new long[m];
        sum[0] = candiesCount[0];
        for (int i = 1; i < m; i++) {
            sum[i] = sum[i-1] + candiesCount[i];
        }

        for (int i = 0; i < n; i++) {
            if(queries[i][0] == 0) {
                res[i] = queries[i][1] < sum[0];
            }else{
                res[i] = (((queries[i][1] + 1)*(long)queries[i][2]) > sum[queries[i][0]-1] && sum[queries[i][0]] > queries[i][1]);
            }
        }

        return res;
    }
}