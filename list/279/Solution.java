public class Solution {
    public int numSquares(int n) {
        int x = n;
        while (x % 4 == 0){
            x /= 4;
        }
        if(x % 8 == 7){
            return 4;
        }
        if(isPerfectSquare(n)){
            return 1;
        }
        int limit = (int)Math.sqrt(n);
        for (int i = 1; i <= limit; i++) {
            if(isPerfectSquare(n - i*i)) {
                return 2;
            }
        }
        return 3;
    }

    private boolean isPerfectSquare(int n){
        int x = (int)Math.sqrt(n);
        return x * x == n;
    }
}