import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println(new Solution().divide(scanner.nextInt(),scanner.nextInt()));
        }
    }

    public int divide(int dividend,int divisor)
    {
        boolean negative = true;
        if(divisor == 1)
            return dividend;
        if(divisor == -1)
        {
            if(dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            return -dividend;
        }
        long a = dividend;
        long b = divisor;
        if((a > 0 && b > 0) || (a < 0 && b < 0))
            negative = false;
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        long result = 0;
        while(a >= b)
        {
            a -= b;
            ++result;
        }
        if(negative)
        {
            if(-result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            return (int)-result;
        }
        else
        {
            if(result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            return (int)result;
        }
    }
}

