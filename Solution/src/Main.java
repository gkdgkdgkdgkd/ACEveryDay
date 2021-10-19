import utils.Utils;

import java.util.Arrays;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("at");
        dictionary.addWord("and");
        dictionary.addWord("an");
        dictionary.addWord("add");
//        Utils.print(dictionary.search("a"));
//        Utils.print(dictionary.search(".at"));
        dictionary.addWord("bat");
//        Utils.print(dictionary.search(".at"));
//        Utils.print(dictionary.search("an."));
//        Utils.print(dictionary.search("a.d."));
        Utils.print(dictionary.search("b."));
//        Utils.print(dictionary.search("a.d."));
//        Utils.print(dictionary.search("."));
//        Utils.print(dictionary);
    }
}