import node.*;
import utils.*;

import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        int[] arr = Utils.randomArraySortedNoRepeated(100_00, -9999, 9999);
        int target = Utils.randomInt(-9999,9999);
        Utils.print(arr);
        Utils.print(target);
        Utils.print(SOLUTION.search(arr,target));
    }
}