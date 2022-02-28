import node.ListNode;
import node.TreeNode;
import utils.Utils;
import utils.print.PrintUtils;

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
//        int n = Utils.randomInt(0,4)+16;
        int n = 3;
//        int[][] req = Utils.randomArray2(16,2,0,n-1);
//        int[][] req = Utils.array2(2,0,1,1,3,1,3,3,4,3,4,4,5,4,5,5,7,5,6,6,8,8,1,7,3);
//        int[][] req = Utils.strToArray2("[[1,1],[1,0],[0,1],[0,0],[0,0],[0,1],[0,1],[1,0],[1,0],[1,1],[0,0],[1,0]]");
//        int[][] req = Utils.strToArray2("[[1,2],[1,2],[2,2],[0,2],[2,1],[1,1],[1,2]]");
        int[][] req = Utils.strToArray2("[[1,2],[2,2],[0,0],[1,1],[0,2],[0,0],[2,1],[0,1],[1,0],[2,2],[0,1],[2,0],[2,2]]");
//        Utils.print(n);
//        Utils.print(req);
        Utils.print(SOLUTION.maximumRequests(n,req));
    }
}