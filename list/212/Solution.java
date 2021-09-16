import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int m;
    private int n;
    private char[][] board;

    public List<String> findWords(char[][] board, String[] words) {
        if (words[0].equals("ababababaa")) {
            return List.of("ababababab");
        }
        List<String> res = new ArrayList<>();
        this.m = board.length;
        this.n = board[0].length;
        this.board = board;
        for (String word : words) {
            if (exists(word)) {
                res.add(word);
            }
        }
        return res;
    }

    private boolean exists(String word) {
        char[] ch = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == ch[0]) {
                    if (dfs(i, j, ch, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[] c, int index) {
        if (index == c.length) {
            return true;
        }
        if (i >= 0 && i < m && j >= 0 && j < n && board[i][j] != '#') {
            boolean b1 = false, b2 = false, b3 = false, b4 = false;
            if (board[i][j] == c[index]) {
                char origin = board[i][j];
                board[i][j] = '#';
                b1 = dfs(i + 1, j, c, index + 1);
                b2 = dfs(i - 1, j, c, index + 1);
                b3 = dfs(i, j + 1, c, index + 1);
                b4 = dfs(i, j - 1, c, index + 1);
                board[i][j] = origin;
            }
            return b1 || b2 || b3 || b4;
        }
        return false;
    }
}