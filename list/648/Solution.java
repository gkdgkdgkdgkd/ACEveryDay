import java.util.List;

public class Solution {
    private final Trie root = new Trie();

    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        for (String word : dictionary) {
            insert(word);
        }
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(find(word)).append(" ");
        }
        return builder.deleteCharAt(builder.length() - 1).toString();
    }

    private static class Trie {
        boolean end = false;
        Trie[] children = new Trie[26];
    }

    private void insert(String str) {
        Trie trie = root;
        for (char c : str.toCharArray()) {
            if (trie.children[c - 'a'] == null) {
                trie.children[c - 'a'] = new Trie();
            }
            trie = trie.children[c - 'a'];
        }
        trie.end = true;
    }

    private String find(String str) {
        Trie trie = root;
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (trie.end) {
                return builder.toString();
            }
            if (trie.children[c - 'a'] == null) {
                return str;
            }
            builder.append(c);
            trie = trie.children[c - 'a'];
        }
        return str;
    }
}
