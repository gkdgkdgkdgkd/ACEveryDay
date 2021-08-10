import utils.RandomUtils;

import java.util.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        System.out.println(SOLUTION.numberOfArithmeticSlices(new int[]{1,2,3,4,5,6,7,9,11,13,15,17,18,19,20}));
    }
}