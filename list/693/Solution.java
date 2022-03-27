public class Solution {
    public boolean hasAlternatingBits(int n) {
        for (int next = n & 1; n > 0; next = n & 1) {
            n >>= 1;
            if (next == (n & 1)) {
                return false;
            }
        }
        return true;
    }
}