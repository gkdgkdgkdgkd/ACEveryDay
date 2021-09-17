public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] diagonal = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int index = 1 << board[i][j] - '1';
                int k = ((i - i % 3) * 3 + j - j % 3) / 3;
                if ((row[i] & index) != 0 || (col[j] & index) != 0 || (diagonal[k] & index) != 0) {
                    return false;
                }
                row[i] |= index;
                col[j] |= index;
                diagonal[k] |= index;
            }
        }
        return true;
    }
}