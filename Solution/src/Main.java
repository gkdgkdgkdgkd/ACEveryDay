import node.TreeNode;
import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        MapSum sum = new MapSum();
        sum.insert("apple",3);
        Utils.print(sum.sum("apple"));
        sum.insert("app",2);
        Utils.print(sum.sum("ap"));
    }
}