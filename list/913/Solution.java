import java.util.Arrays;

public class Solution {
    private static final int MOUSE_WIN = 1;
    private static final int CAT_WIN = 2;
    private static final int DRAW = 0;
    private int n;
    private int[][] graph;
    private int[][][] dp;

    public int catMouseGame(int[][] graph) {
        n = graph.length;
        this.graph = graph;
        dp = new int[n][n][n << 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return getResult(1, 2, 0);
    }

    public int getResult(int mouse, int cat, int turns) {
        if (turns == (n << 1)) {
            return DRAW;
        }
        if (dp[mouse][cat][turns] < 0) {
            if (mouse == 0) {
                dp[mouse][cat][turns] = MOUSE_WIN;
            } else if (cat == mouse) {
                dp[mouse][cat][turns] = CAT_WIN;
            } else {
                dp[mouse][cat][turns] = getNextResult(mouse, cat, turns);
            }
        }
        return dp[mouse][cat][turns];
    }

    public int getNextResult(int mouse, int cat, int turns) {
        int curMove = ((turns & 1) == 0 ? mouse : cat);
        int defaultResult = (curMove == mouse ? CAT_WIN : MOUSE_WIN);
        int result = defaultResult;
        int[] nextNodes = graph[curMove];
        for (int next : nextNodes) {
            if (curMove == cat && next == 0) {
                continue;
            }
            int nextMouse = (curMove == mouse ? next : mouse);
            int nextCat = (curMove == cat ? next : cat);
            int nextResult = getResult(nextMouse, nextCat, turns + 1);
            if (nextResult != defaultResult) {
                result = nextResult;
                if (result != DRAW) {
                    break;
                }
            }
        }
        return result;
    }
}