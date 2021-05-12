import java.util.Arrays;

public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int [] result = new int [m];
        int [] all = new int [n];

        all[0] = arr[0];
        for(int i=1;i<n;++i){
            all[i] = all[i-1] ^ arr[i];
        }
        for(int i=0;i<m;++i){
            if(queries[i][0] == 0){
                result[i] = all[queries[i][1]];
            }else{
                result[i] = all[queries[i][0]-1] ^ all[queries[i][1]];
            }
        }
        return result;
    }
}