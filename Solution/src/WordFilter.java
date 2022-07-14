import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class WordFilter {
    private final Trie prefixRoot = new Trie();
    private final Trie suffixRoot = new Trie();

    public WordFilter(String[] words) {
        for (int n = words.length - 1; n >= 0; --n) {
            insert(words[n], n);
        }
    }

    public int f(String pref, String suff) {
        List<Integer> prefix = findPrefix(pref);
        List<Integer> suffix = findSuffix(suff);
        int res = -1;
        for (int i = 0, j = 0, prefixLen = prefix.size(), suffixLen = suffix.size(); i < prefixLen && j < suffixLen; ) {
            int pre = prefix.get(i);
            int suf = suffix.get(j);
            if (pre == suf) {
                return pre;
            }
            if (pre > suf) {
                ++i;
            } else {
                ++j;
            }
        }
        return res;
    }

    private static class Trie {
        Trie[] children = new Trie[26];
        List<Integer> list = new ArrayList<>();
    }

    private void insert(String str, int index) {
        Trie temp = prefixRoot;
        for (char c : str.toCharArray()) {
            if (temp.children[c - 'a'] == null) {
                temp.children[c - 'a'] = new Trie();
            }
            temp = temp.children[c - 'a'];
            temp.list.add(index);
        }

        temp = suffixRoot;
        for (int i = str.length() - 1; i >= 0; --i) {
            int charIndex = str.charAt(i) - 'a';
            if (temp.children[charIndex] == null) {
                temp.children[charIndex] = new Trie();
            }
            temp = temp.children[charIndex];
            temp.list.add(index);
        }
    }

    private List<Integer> findPrefix(String str) {
        Trie root = prefixRoot;
        for (char c : str.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                return Collections.emptyList();
            }
            root = root.children[c - 'a'];
        }
        return root.list;
    }

    private List<Integer> findSuffix(String str) {
        Trie root = suffixRoot;
        for (int i = str.length() - 1; i >= 0; --i) {
            int charIndex = str.charAt(i) - 'a';
            if (root.children[charIndex] == null) {
                return Collections.emptyList();
            }
            root = root.children[charIndex];
        }
        return root.list;
    }
}
