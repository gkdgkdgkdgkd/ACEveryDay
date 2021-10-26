public class WordDictionary {
    private final Trie root = new Trie();
    private boolean find = false;

    public void addWord(String word) {
        Trie cur = root;
        for (char c : word.toCharArray()) {
            if (cur.node[c - 'a'] == null) {
                cur.node[c - 'a'] = new Trie();
            }
            cur = cur.node[c - 'a'];
        }
        cur.end = true;
    }

    public boolean search(String word) {
        find = false;
        search(root, word.toCharArray(), 0);
        return find;
    }

    private void search(Trie cur, char[] c, int i) {
        if (i == c.length || find) {
            if (cur.end) {
                find = true;
            }
            return;
        }
        if (c[i] != '.') {
            if (cur.node[c[i] - 'a'] == null) {
                return;
            }
            search(cur.node[c[i] - 'a'], c, i + 1);
        } else {
            for (int j = 0; j < 26; j++) {
                if (cur.node[j] != null) {
                    search(cur.node[j], c, i + 1);
                }
            }
        }
    }

    private static class Trie {
        Trie[] node = new Trie[26];
        boolean end = false;
    }
}
