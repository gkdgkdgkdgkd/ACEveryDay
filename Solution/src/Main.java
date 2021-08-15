import node.ListNode;
import node.TreeNode;
import utils.Utils;

import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        Utils.print(SOLUTION.findPaths(3,3,5,1,2));
    }
}