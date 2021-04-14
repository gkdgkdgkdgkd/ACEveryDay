public class Trie {
    private boolean isEnd = false;
    private Trie[] children = new Trie[26];

    public Trie() {
    }

    public void insert(String word) {
        Trie node = searchPrefix(word,true);
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = searchPrefix(word,false);
        return node != null && node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix,false) != null;
    }

    private Trie searchPrefix(String prefix,boolean isInsertMode){
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if(node.children[index] == null){
                if(isInsertMode){
                    node.children[index] = new Trie();
                }else{
                    return null;
                }
            }
            node = node.children[index];
        }
        return node;
    }
}