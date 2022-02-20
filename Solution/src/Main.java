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
        for (int i = 0; i < 10; i++) {
            int[] arr = Utils.randomArray01(1000);
            arr[999] = 0;
            Utils.print(arr);
        }
    }
}