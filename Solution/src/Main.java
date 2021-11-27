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
    private static final Solution SOLUTION = new Solution(3,1);
    public static void main(String[] args) {
        Utils.print(SOLUTION.flip());
        Utils.print(SOLUTION.flip());
        Utils.print(SOLUTION.flip());
        SOLUTION.reset();
        Utils.print(SOLUTION.flip());
//        Utils.print(SOLUTION.flip());
    }
}