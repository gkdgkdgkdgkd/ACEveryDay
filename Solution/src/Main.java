import node.*;
import utils.*;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.math.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        int[] arr = Utils.randomArray(1000,1,100);
        int k = Utils.randomInt(1,1000);
        Utils.print(arr);
        Utils.print(k);
        Utils.print(SOLUTION.chalkReplacer(arr,k));
    }
}