import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        System.out.println(SOLUTION.minCostClimbingStairs(new int[]{10,15,20}));
    }
}