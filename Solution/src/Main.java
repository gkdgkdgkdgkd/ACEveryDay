import utils.Utils;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.shortestToChar("baaa",'a'));
    }
}