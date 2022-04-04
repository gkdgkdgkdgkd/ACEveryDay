public class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        while (left <= right) {
            if (((1 << Integer.bitCount(left++)) & 665772) != 0) {
                ++res;
            }
        }
        return res;
    }
}