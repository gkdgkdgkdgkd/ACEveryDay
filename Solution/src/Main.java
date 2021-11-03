import node.ListNode;
import sun.misc.Unsafe;
import utils.Utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception{
        int m = Utils.randomInt(1,200);
        int n = Utils.randomInt(1,200);
        int[][] arr = Utils.array2(m,Utils.randomArray(m*n,1,20000));
//        int[][] arr = Utils.array2(4,26, 82, 119, 95, 163, 49, 4, 134, 121, 76, 24, 29, 116, 79, 195, 119);
        Utils.print(arr);
//        Utils.print(SOLUTION.trapRainWater(arr));
    }
}