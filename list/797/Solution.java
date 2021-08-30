import java.util.*;

public class Solution {
    private int n;
    private final List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.n = graph.length;
        dfs(0, new ArrayList<>(), graph);
        return res;
    }

    private void dfs(int i, List<Integer> temp, int[][] graph) {
        temp.add(i);
        if (i == n - 1) {
            res.add(new ArrayList<>(temp));
        }
        for (int v : graph[i]) {
            dfs(v, temp, graph);
        }
        temp.remove(temp.size() - 1);
    }
}