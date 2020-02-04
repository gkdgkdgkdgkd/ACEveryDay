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
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
            negative = false;
        dividend = dividend > 0 ? dividend : -dividend;
        divisor = divisor > 0 ? divisor : -divisor;
        int result = 0;
        while(dividend >= divisor)
        {
            dividend -= divisor;
            ++result;
        }
        return negative ? -result : result;
    }
}

