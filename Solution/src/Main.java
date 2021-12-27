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
        int[] arr = Utils.randomArray(1_000,1,120);
        Utils.print(arr);
//        Utils.print(SOLUTION.numFriendRequests(Utils.array(16,16)));
    }
}