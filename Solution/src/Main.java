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
//        String[] str = Utils.array("cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat");
        String[] str = Utils.array("a","aa","aaa","aaaa","aaaaa","aaaaaa");
        Utils.print(SOLUTION.findAllConcatenatedWordsInADict(str));
    }
}