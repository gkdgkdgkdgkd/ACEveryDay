import node.TreeNode;
import utils.Utils;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) {
        int[] arr = Utils.randomArray(100,1,3);
        int[][] temp = Utils.array2(10,arr);
        Utils.print(temp);
        Utils.print(4);
        Utils.print(5);
        Utils.print(temp[4][5]);
    }
}