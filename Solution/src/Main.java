import node.TreeNode;
import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(Integer.MAX_VALUE);
        for (int i = 0; i < 30; i++) {
            Utils.print(Utils.randomInt(1,Integer.MAX_VALUE));
        }
    }
}