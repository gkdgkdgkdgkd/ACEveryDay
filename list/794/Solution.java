public class Solution {
    public boolean validTicTacToe(String[] board) {
        char[][] b = new char[3][3];
        int oNum = 0;
        int xNum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((b[i][j] = board[i].charAt(j)) == 'O') {
                    ++oNum;
                } else if (b[i][j] == 'X') {
                    ++xNum;
                }
            }
        }
        if (xNum < oNum || xNum > oNum + 1) {
            return false;
        }
        boolean xWin = check(b, 'X');
        boolean oWin = check(b, 'O');
        if (xWin) {
            return !oWin && xNum > oNum;
        } else if (oWin) {
            return oNum == xNum;
        }
        return true;
    }

    private boolean check(char[][] board, char ch) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == ch && board[i][1] == ch && board[i][2] == ch) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == ch && board[1][j] == ch && board[2][j] == ch) {
                return true;
            }
        }
        if (board[1][1] == ch) {
            return (board[0][0] == ch && board[2][2] == ch) || (board[0][2] == ch && board[2][0] == ch);
        }
        return false;
    }
}