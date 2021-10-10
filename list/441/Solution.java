public class Solution {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(n * 2.0 + 0.25) - 0.5);
    }
}