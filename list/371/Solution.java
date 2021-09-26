public class Solution {
    public int getSum(int a, int b) {
        int sum = 0;
        boolean carry = false;
        int mask = 1;
        while (a != 0 || b != 0) {
            int x = a & 1;
            int y = b & 1;
            if (x == 1 && y == 1) {
                if (carry) {
                    sum |= mask;
                } else {
                    carry = true;
                }
            } else if (x == 0 && y == 0) {
                if (carry) {
                    carry = false;
                    sum |= mask;
                }
            } else if (!carry) {
                sum |= mask;
            }
            mask <<= 1;
            a >>>= 1;
            b >>>= 1;
        }
        if (carry) {
            sum |= mask;
        }
        return sum;
    }
}