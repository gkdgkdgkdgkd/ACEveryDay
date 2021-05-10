public class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int [] r = new int[n];
        int all = 0;
        int temp;
        for (int i = 1; i <= n; i++) {
            all ^= i;
            temp = (i<<1) - 1;
            if(temp < n-1){
                all ^= encoded[temp];
            }
        }
        r[0] = all;

        for (int i = 0; i < n-1; i++) {
            all ^= encoded[i];
            r[i+1] = all;
        }
        return r;
    }
}