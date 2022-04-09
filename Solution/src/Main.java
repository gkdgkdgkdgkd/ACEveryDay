import utils.Utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.reachingPoints(2148,3666,38580187,430709902));
        Utils.print(SOLUTION.reachingPoints(3, 7, 3, 4));
        Utils.print(SOLUTION.reachingPoints(10, 5, 15, 5));
    }
}