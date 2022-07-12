public class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        long row = 0;
        long col = 0;
        int rowCount = 0;
        int colCount = 0;
        for (int[] index : indices) {
            long temp = 1L << index[0];
            if ((row & temp) == 0) {
                ++rowCount;
                row |= temp;
            } else {
                --rowCount;
                row &= ~temp;
            }
            temp = 1L << index[1];
            if ((col & temp) == 0) {
                ++colCount;
                col |= temp;
            } else {
                --colCount;
                col &= ~temp;
            }
        }
        return rowCount * (n - colCount) + colCount * (m - rowCount);
    }
}