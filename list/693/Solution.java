public class Solution {
    public boolean hasAlternatingBits(int n) {
        return ((n ^ (n >> 1)) & ((n ^ (n >> 1)) + 1)) == 0;
    }
}