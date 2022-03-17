public class Solution {
    private static int max;
    private static String res;

    public String longestWord(String[] words) {
        max = 0;
        res = "";
        Trie root = new Trie();
        for (String str : words) {
//            if (str.length() <= 30) {
            root.insert(str);
//            }
        }
        root.dfs(0, root);
        return res;
    }

    private static class Trie {
        Trie[] children = new Trie[26];
        String str = "";

        public void insert(String str) {
            Trie root = this;
            for (char c : str.toCharArray()) {
                if (root.children[c - 'a'] == null) {
                    root.children[c - 'a'] = new Trie();
                }
                root = root.children[c - 'a'];
            }
            root.str = str;
        }

        private void dfs(int level, Trie root) {
            if (level > max) {
                max = level;
                res = root.str;
            } else if (level == max && res.compareTo(root.str) > 0) {
                res = root.str;
            }
            for (Trie trie : root.children) {
                if (trie != null && !trie.str.equals("")) {
                    dfs(level + 1, trie);
                }
            }
        }
    }
}