import java.util.*;

public class Solution {
    private final Trie root = new Trie();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<String> res = new ArrayList<>();
        for (String str : words) {
            int n = str.length();
            if (n == 0) {
                continue;
            }
            if (search(str, 0)) {
                res.add(str);
            } else {
                add(str);
            }
        }
        return res;
    }

    private void add(String str) {
        Trie node = root;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new Trie();
            }
            node = node.children[c - 'a'];
        }
        node.isEnd = true;
    }

    private boolean search(String str, int index) {
        int n = str.length();
        if (index == n) {
            return true;
        }
        Trie node = root;
        for (int i = index; i < n; i++) {
            char c = str.charAt(i);
            node = node.children[c - 'a'];
            if (node == null) {
                return false;
            }
            if (node.isEnd) {
                if (search(str, i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static class Trie {
        Trie[] children = new Trie[26];
        boolean isEnd = false;
    }
}