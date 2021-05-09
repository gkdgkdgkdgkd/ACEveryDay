public class Solution {
    public double myPow(double x, int n) {
        if (n == 0 || Math.abs(x - 1.0) < 1e-6) {
            return 1.0;
        }
        if (Math.abs(x + 1.0) < 1e-6) {
            return (n & 1) == 1 ? -1.0 : 1.0;
        }
        if (n == Integer.MIN_VALUE) {
            return 0.0;
        }
        return n > 0 ? f(x,n) : 1/f(x,-n);
    }

    private double f(double x,int n){
        double ans = 1.0;
        double temp = x;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= temp;
            }
            temp *= temp;
            n >>= 1;
        }
        return ans;
    }
}