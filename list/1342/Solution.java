public class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int res = 0;
        if ((num >> 16) == 0) {
            res += 16;
            num <<= 16;
        }
        if ((num >> 24) == 0) {
            res += 8;
            num <<= 8;
        }
        if ((num >> 28) == 0) {
            res += 4;
            num <<= 4;
        }
        if ((num >> 30) == 0) {
            res += 2;
            num <<= 2;
        }
        if ((num >> 31) == 0) {
            ++res;
        }

        num = (num & 0x55555555) + ((num >> 1) & 0x55555555);
        num = (num & 0x33333333) + ((num >> 2) & 0x33333333);
        num = (num & 0x0F0F0F0F) + ((num >> 4) & 0x0F0F0F0F);
        num = (num & 0x00FF00FF) + ((num >> 8) & 0x00FF00FF);
        num = (num & 0x0000FFFF) + ((num >> 16) & 0x0000FFFF);
        return 31 + num - res;
    }
}