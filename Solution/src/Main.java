import node.TreeNode;
import utils.Utils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        SummaryRanges ranges = new SummaryRanges();
        ranges.addNum(1);
        Utils.print(ranges.getIntervals());
        ranges.addNum(9);
        ranges.addNum(8);
        ranges.addNum(8);
        Utils.print(ranges.getIntervals());
    }
}