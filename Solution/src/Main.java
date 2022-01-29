import node.TreeNode;
import utils.Utils;

import java.lang.reflect.Array;
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
        Utils.print(Utils.array2(500,Utils.randomArray(500*300,0,1)));
//        Utils.print(SOLUTION.highestPeak(Utils.array2(3,0,0,1,1,0,0,0,0,0)));
    }
}