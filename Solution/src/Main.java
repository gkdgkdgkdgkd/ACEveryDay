import node.TreeNode;
import utils.Utils;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) {
//        Utils.print(Utils.randomArrayNoRepeated(10_000,0,1_000_000));
        Utils.print(SOLUTION.findRelativeRanks(Utils.array(5,4,3,2,1)));
    }
}