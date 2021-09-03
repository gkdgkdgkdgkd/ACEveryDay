import node.ListNode;
import node.Node;
import node.TreeNode;
import utils.Utils;
import utils.treenode.TreeNodeUtils;

import java.math.BigInteger;
import java.net.URI;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        int[] arr = Utils.randomArray(10_000);
        int k = Math.min(100_00,arr.length);
        Utils.print(arr);
        Utils.print(k);
//        Utils.print(SOLUTION.smallestK(arr,4));
    }
}