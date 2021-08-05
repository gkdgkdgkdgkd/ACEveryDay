import java.util.LinkedList;
import java.util.List;

public class Solution {
    private static final int WHITE = 0;
    private static final int GRAY = 1;
    private static final int BLACK = 2;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int [] colors = new int[n];
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(dfs(i,colors,graph)){
                list.add(i);
            }
        }
        return list;
    }

    private boolean dfs(int i,int[] colors,int[][] graph){
        if(colors[i] == WHITE){
            colors[i] = GRAY;
            int[] next = graph[i];
            for (int node:next){
                if(!dfs(node,colors,graph)){
                    return false;
                }
            }
            colors[i] = BLACK;
            return true;
        }
        return colors[i] == BLACK;
    }
}