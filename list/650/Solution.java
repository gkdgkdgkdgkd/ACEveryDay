public class Solution {
    public int minSteps(int n) {
        if(n == 1){
            return 0;
        }
        int res = 0;
        int end = n>>1;
        for (int i = 2; i <= end; i++) {
            while (n % i == 0) {
                n /= i;
                res += i;
            }
        }
        return res == 0 ? n : res;
    }
}