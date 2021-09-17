public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] diagonal = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int index = board[i][j] - '1';
                if (!row[i][index]) {
                    row[i][index] = true;
                } else {
                    return false;
                }
                if (!col[j][index]) {
                    col[j][index] = true;
                } else {
                    return false;
                }
                int k = ((i - i % 3) * 3 + j - j % 3) / 3;
                if (!diagonal[k][index]) {
                    diagonal[k][index] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}