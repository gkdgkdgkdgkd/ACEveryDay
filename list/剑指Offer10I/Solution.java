public class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        int a = 0;
        int b = 1;
        int c = a+b;
        for (int i = 2; i <= n; i++) {
            c = (a+b) % 1_000_000_007;
            a = b;
            b = c;
        }
        return c;
    }
}