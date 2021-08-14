import node.ListNode;
import node.TreeNode;
import utils.Utils;

import java.math.BigInteger;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        Utils.print(SOLUTION.unhappyFriends(4, new int[][]{
                {1, 3, 2},
                {2, 3, 0},
                {1, 3, 0},
                {0, 2, 1},
        }, new int[][]{
                {1, 3},
                {0, 2}
        }));
    }
}