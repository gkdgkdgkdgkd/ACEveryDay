import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    private final int N = 26;
    private final int M = N * N;
    private int idx = 0;
    private int cnt = 0;
    private final int[] he = new int[N];
    private final int[] e = new int[M];
    private final int[] ne = new int[M];
    private final int[] in = new int[N];
    private final boolean[] vis = new boolean[N];

    void add(int a, int b) {
        e[idx] = b;
        ne[idx] = he[a];
        he[a] = idx++;
        in[b]++;
    }

    public String alienOrder(String[] ws) {
        int n = ws.length;
        Arrays.fill(he, -1);
        for (int i = 0; i < n; i++) {
            for (char c : ws[i].toCharArray()) {
                if (!vis[c - 'a'] && ++cnt >= 0) {
                    vis[c - 'a'] = true;
                }
            }
            for (int j = 0; j < i; j++) {
                if (!build(ws[j], ws[i])) {
                    return "";
                }
            }
        }
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < 26; i++) {
            if (vis[i] && in[i] == 0) d.addLast(i);
        }
        StringBuilder sb = new StringBuilder();
        while (!d.isEmpty()) {
            int u = d.pollFirst();
            sb.append((char) (u + 'a'));
            for (int i = he[u]; i != -1; i = ne[i]) {
                int j = e[i];
                if (--in[j] == 0) {
                    d.addLast(j);
                }
            }
        }
        return sb.length() == cnt ? sb.toString() : "";
    }

    boolean build(String a, String b) {
        int n = a.length(), m = b.length(), len = Math.min(n, m);
        for (int i = 0; i < len; i++) {
            int c1 = a.charAt(i) - 'a', c2 = b.charAt(i) - 'a';
            if (c1 != c2) {
                add(c1, c2);
                return true;
            }
        }
        return n <= m;
    }
}