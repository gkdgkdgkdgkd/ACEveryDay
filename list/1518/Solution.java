public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles / (--numExchange)) - (numBottles % numExchange == 0 ? 1 : 0);
    }
}