public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int num = 0;
        for (int i = 0, n = bits.length - 1; i < n; i++) {
            int v = bits[i];
            if (v == 0) {
                if (num > 0) {
                    --num;
                }
            } else if (num > 0) {
                --num;
            } else {
                ++num;
            }
        }
        return num == 0;
    }
}