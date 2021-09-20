import node.*;
import utils.*;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.Field;
import java.math.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
//        int[] arr = Utils.randomArray(200,0,100);
        int[] arr = Utils.array(44, 16, 95, 58, 64, 76, 59, 1, 43, 83, 80, 41);
        Utils.print(arr);
        Utils.print(SOLUTION.findNumberOfLIS(arr));
    }
}