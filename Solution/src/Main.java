import node.TreeNode;
import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        int[][] arr = Utils.array2(4,1,1,3,3,   3,1,4,2,     3,2,4,4,     1,3,2,4,     2,3,3,4);
        int[][] arr = Utils.array2(4,0,0,1,1,        0,0,2,1,      1,0,2,1,     0,2,2,3);
        Utils.print(SOLUTION.isRectangleCover(arr));
    }
}