import node.ListNode;
import node.Node;
import node.TreeNode;
import utils.Utils;
import utils.treenode.TreeNodeUtils;

import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        Utils.print(SOLUTION.compareVersion("0.0.0.0.0.2.0","0.0.0.0.0.2.1"));
    }
}