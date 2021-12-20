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
//        Utils.print(Utils.randomArraySortedNoRepeated(10_000,1,50_000_000));
//        Utils.print(Utils.randomArraySortedNoRepeated(10_000,1,50_000_000));
        int[] arr1 = Utils.array(282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923);
        int[] arr2 = Utils.array(823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612);
        Utils.print(SOLUTION.findRadius(arr1,arr2));
    }
}