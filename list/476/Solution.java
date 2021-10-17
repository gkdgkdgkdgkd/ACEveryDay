public class Solution {
    public int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();
        int a = 1;
        while (len-- > 1) {
            a <<= 1;
            a |= 1;
        }
        return ~num & a;
    }
}