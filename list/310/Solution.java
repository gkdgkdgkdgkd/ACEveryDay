import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private final int N = 20010;
    private final int M = N<<1;
    private int idx = 0;
    private final int[] he = new int[N];
    private final int[] e = new int[M];
    private final int[] ne = new int[M];
    private final int[] f1 = new int[N];
    private final int[] f2 = new int[N];
    private final int[] g = new int[N];
    private final int[] p = new int[N];

    void add(int a, int b) {
        e[idx] = b;
        ne[idx] = he[a];
        he[a] = idx++;
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Arrays.fill(he, -1);
        for (int[] e : edges) {
            int a = e[0], b = e[1];
            add(a, b);
            add(b, a);
        }
        dfs1(0, -1);
        dfs2(0, -1);
        List<Integer> ans = new ArrayList<>();
        int min = n;
        for (int i = 0; i < n; i++) {
            int cur = Math.max(f1[i], g[i]);
            if (cur < min) {
                min = cur;
                ans.clear();
                ans.add(i);
            } else if (cur == min) {
                ans.add(i);
            }
        }
        return ans;
    }

    int dfs1(int u, int fa) {
        for (int i = he[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if (j == fa) continue;
            int sub = dfs1(j, u) + 1;
            if (sub > f1[u]) {
                f2[u] = f1[u];
                f1[u] = sub;
                p[u] = j;
            } else if (sub > f2[u]) {
                f2[u] = sub;
            }
        }
        return f1[u];
    }

    void dfs2(int u, int fa) {
        for (int i = he[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if (j == fa) continue;
            if (p[u] != j) g[j] = Math.max(g[j], f1[u] + 1);
            else g[j] = Math.max(g[j], f2[u] + 1);
            g[j] = Math.max(g[j], g[u] + 1);
            dfs2(j, u);
        }
    }
}