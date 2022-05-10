public class Solution {
    private static final int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public boolean canMouseWin(String[] grid, int catJump, int mouseJump) {
        int mouse = 0;
        int cat = 0;
        int food = 0;
        final int m = grid.length;
        final int n = grid[0].length();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = grid[i].charAt(j);
                if (ch == 'M') {
                    mouse = i * n + j;
                } else if (ch == 'C') {
                    cat = i * n + j;
                } else if (ch == 'F') {
                    food = i * n + j;
                }
            }
        }
        final int size = m * n;
        int[][] mdp = new int[size][size];
        int[][] cdp = new int[size][size];
        for (int i = 0; i < size; i++) {
            if (i == food) {
                continue;
            }
            mdp[i][i] = mdp[i][food] = cdp[food][i] = -1;
            cdp[i][i] = cdp[i][food] = mdp[food][i] = 1;
        }
        for (int round = 0; round < 1000; round++) {
            boolean changed = false;
            for (int i = 0; i < size; i++) {
                int mx = i / n;
                int my = i % n;
                if (grid[mx].charAt(my) == '#') {
                    continue;
                }
                for (int j = 0; j < size; j++) {
                    int cx = j / n;
                    int cy = j % n;
                    if (grid[cx].charAt(cy) == '#') {
                        continue;
                    }
                    if (mdp[i][j] == 0) {
                        boolean win = false;
                        boolean lose = true;
                        for (int[] d : dir) {
                            for (int jump = 0; jump <= mouseJump; jump++) {
                                int mx2 = mx + d[0] * jump;
                                int my2 = my + d[1] * jump;
                                if (mx2 < 0 || mx2 >= m || my2 < 0 || my2 >= n) {
                                    break;
                                }
                                if (grid[mx2].charAt(my2) == '#') {
                                    break;
                                }
                                int k = mx2 * n + my2;
                                lose &= cdp[k][j] == 1;
                                if (cdp[k][j] == -1) {
                                    win = true;
                                    break;
                                }
                            }
                            if (win) {
                                break;
                            }
                        }
                        mdp[i][j] = (win ? 1 : (lose ? -1 : 0));
                        if (win || lose) {
                            changed = true;
                        }
                    }

                    if (cdp[i][j] == 0) {
                        boolean win = false;
                        boolean lose = true;
                        for (int[] d : dir) {
                            for (int jump = 0; jump <= catJump; jump++) {
                                int cx2 = cx + d[0] * jump;
                                int cy2 = cy + d[1] * jump;
                                if (cx2 < 0 || cx2 >= m || cy2 < 0 || cy2 >= n) {
                                    break;
                                }
                                if (grid[cx2].charAt(cy2) == '#') {
                                    break;
                                }
                                int k = cx2 * n + cy2;
                                lose &= mdp[i][k] == 1;
                                if (mdp[i][k] == -1) {
                                    win = true;
                                    break;
                                }
                            }
                            if (win) {
                                break;
                            }
                        }
                        cdp[i][j] = (win ? 1 : (lose ? -1 : 0));
                        if (win || lose) {
                            changed = true;
                        }
                    }
                }
            }
            if (mdp[mouse][cat] == 1) {
                return true;
            }
            if (mdp[mouse][cat] == -1 || !changed) {
                return false;
            }
        }
        return false;
    }
}