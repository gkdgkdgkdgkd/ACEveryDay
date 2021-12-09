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
        String[] str = new String[3];
        for (int i = 0; i < 10; i++) {
            str[0] = Utils.randomStr(3,'O','X');
            str[1] = Utils.randomStr(3,'O','X');
            str[2] = Utils.randomStr(3,'O','X');
            Utils.print(str);
        }
    }
}