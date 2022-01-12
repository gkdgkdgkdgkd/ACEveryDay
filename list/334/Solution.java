public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length <= 2) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int v : nums) {
            if (v <= a) {
                a = v;
            } else if (v <= b) {
                b = v;
            } else {
                return true;
            }
        }
        return false;
    }
}