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
        boolean negative = (dividend > 0) ^ (divisor > 0);
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
        int result = 0;
        while(dividend <= divisor)
        {
            int tempDivisor = divisor;
            int tempResult = 1;
            while(dividend < (tempDivisor<<1) && tempDivisor > (Integer.MIN_VALUE >> 1))
            {
                tempDivisor <<= 1;
                tempResult <<= 1;
            }
            dividend -= tempDivisor;
            result += tempResult;
        }
        if(negative)
            return -result;
        return result == Integer.MIN_VALUE ? Integer.MAX_VALUE : result;
    }
}
