public class Solution {
    public int totalMoney(int n) {
        int round = n / 7;
        int reminder = n % 7;
        return round * (7 * round + 49) / 2 + reminder * (reminder + 2 * round + 1) / 2;
    }
}