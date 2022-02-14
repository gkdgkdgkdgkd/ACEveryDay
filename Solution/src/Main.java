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
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(1,1,2,3,3,4,4,8,8)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(1,1,3,3,4,4,5,8,8)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(1,1,3,3,4,4,7)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(0,1,1,3,3,4,4,8,8)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(0,0,2,8,8)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(0,0,4,4,5)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(1,1,3,3,4,4,6,6,7,8,8)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(0,0,1)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(1)));
        Utils.print(SOLUTION.singleNonDuplicate(Utils.array(1,1,2)));
    }
}