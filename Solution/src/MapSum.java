public class MapSum {
    private final MapSum[] children = new MapSum[26];
    private int val;

    public void insert(String key, int val) {
        MapSum root = this;
        for (char c : key.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                root.children[c - 'a'] = new MapSum();
            }
            root = root.children[c - 'a'];
        }
        root.val = val;
    }

    public int sum(String prefix) {
        MapSum root = this;
        for (char c : prefix.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                return 0;
            }
            root = root.children[c - 'a'];
        }
        return root.val + dfs(root);
    }

    private int dfs(MapSum root) {
        int total = 0;
        for (MapSum next : root.children) {
            if (next != null) {
                total += next.val + dfs(next);
            }
        }
        return total;
    }
}
