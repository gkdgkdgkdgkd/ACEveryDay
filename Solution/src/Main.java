import node.TreeNode;
import utils.Utils;

import java.util.Arrays;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) {
        int[] arr = Utils.randomArray(10,0,10000);
        Utils.print(arr);
        Utils.print(Arrays.stream(arr).sum());
        Utils.print(SOLUTION.findMinMoves(arr));
    }
}