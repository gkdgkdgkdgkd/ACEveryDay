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
//        int[][] arr = {{1,2},{3,4},{5,6},{7,8},{9,10}};
//        Utils.print(SOLUTION.scheduleCourse(arr));
//        Utils.print(Utils.array2(2,Utils.array(1,2,3,4,5,6,7,8,9,10)));
//        Utils.print(SOLUTION.scheduleCourse(arr));
        Utils.print(Utils.array2(2,Utils.randomArray(5000,1,2000)));
    }
}