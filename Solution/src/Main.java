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
//        Utils.print(SOLUTION.eatenApples(Utils.array(3,0,0,0,0,2),Utils.array(3,0,0,0,0,2)));
//        Utils.print(SOLUTION.eatenApples(Utils.array(1,2,3,5,2),Utils.array(3,2,1,4,2)));
//        Utils.print(SOLUTION.eatenApples(Utils.array(4,2),Utils.array(3,7)));
        int len = 6;
        int[] arr1 = Utils.randomArray(len, 1, 8);
        int[] arr2 = Utils.randomArray(len, 1, 8);
        int num = Utils.randomInt(1, len/4);
        for (int i = 0; i < num; i++) {
            int index = Utils.randomInt(0, len - 1);
            arr1[index] = arr2[index] = 0;
        }
        Utils.print(arr1);
        Utils.print(arr2);
    }
}