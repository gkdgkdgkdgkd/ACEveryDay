import node.TreeNode;
import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) {
        Utils.print(SOLUTION.kthSmallestPrimeFraction(Utils.array(1,7),1));
    }
}