public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int v : nums) {
            xor ^= v;
        }
        xor = xor & (-xor);
        int a = 0;
        int b = 0;
        for (int v : nums) {
            if ((v & xor) != 0) {
                a ^= v;
            } else {
                b ^= v;
            }
        }
        return new int[]{a, b};
    }
}