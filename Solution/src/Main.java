import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        MagicDictionary dictionary = new MagicDictionary();
        dictionary.buildDict(Utils.array("hello", "leetcode","hallo"));
        Utils.print(dictionary.search("hello"));
        Utils.print(dictionary.search("hhllo"));
        Utils.print(dictionary.search("hell"));
        Utils.print(dictionary.search("leetcoded"));
    }
}