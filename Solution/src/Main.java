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
        int len = (100_00 << 1);
        int[][] bookings = new int[len][];
        for (int i = 0; i < len; i++) {
            bookings[i] = new int[3];
            bookings[i][0] = Utils.randomInt(1, 100_00);
            bookings[i][1] = Utils.randomInt(bookings[i][0] + 1, 100_00 << 1);
            bookings[i][2] = Utils.randomInt(1,100_00);
        }
        Utils.print(bookings);
//        Utils.print(SOLUTION.corpFlightBookings(bookings,len));
    }
}