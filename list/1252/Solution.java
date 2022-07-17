public class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        long row = 0;
        long col = 0;
        int rowCount = 0;
        int colCount = 0;
        for (int[] index : indices) {
            if ((row & (1L << index[0])) == 0) {
                ++rowCount;
                row |= 1L << index[0];
            } else {
                --rowCount;
                row &= ~(1L << index[0]);
            }
            if ((col & (1L << index[1])) == 0) {
                ++colCount;
                col |= 1L << index[1];
            } else {
                --colCount;
                col &= ~(1L << index[1]);
            }
        }
        return rowCount * (n - colCount) + colCount * (m - rowCount);
    }
}
