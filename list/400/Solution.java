public class Solution {
    private static final int[] count = {1, 10, 190, 2890, 38890, 488890, 5888890, 68888890, 788888890};
    private static final int[] start = {1, 10, 100, 1_000, 10_000, 100_000, 1_000_000, 10_000_000, 100_000_000, 1_000_000_000};
    private static final int[] bitCount = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int findNthDigit(int n) {
        int index = 0;
        while (index + 1 < 9 && n > count[index + 1]) {
            ++index;
        }
        int shift = (n - count[index]) / bitCount[index];
        int mod = (n - count[index]) % bitCount[index];
        return String.valueOf(start[index] + shift).charAt(mod) - '0';
    }
}