import node.TreeNode;
import utils.Utils;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        int[][] richer = Utils.array2(2, 1, 0, 2, 1, 3, 1, 3, 7, 4, 3, 5, 3, 6, 3);
        int[] quiet = Utils.array(3, 2, 5, 4, 6, 1, 7, 0);
        Utils.print(SOLUTION.loudAndRich(richer, quiet));
    }
}