public class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int v : nums) {
            if (v > first) {
                third = second;
                second = first;
                first = v;
            } else if (v > second && v != first) {
                third = second;
                second = v;
            } else if (v > third && v != first && v != second) {
                third = v;
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}