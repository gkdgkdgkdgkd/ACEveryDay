import node.*;
import utils.*;

import java.math.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        int k = 2;
        int w = 0;
//        int w = Utils.randomInt(1,1234);
//        int [] profit = Utils.randomArray(10,0,1_000);
//        int [] capital = Utils.randomArray(10,0,1_000);
        int [] profit = Utils.array(1,2,3);
        int [] capital = Utils.array(0,9,10);
        Utils.print(k);
        Utils.print(w);
        Utils.print(profit);
        Utils.print(capital);
        Utils.print(SOLUTION.findMaximizedCapital(k,w,profit,capital));
    }
}