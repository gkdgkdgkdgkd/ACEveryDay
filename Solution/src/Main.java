import utils.Utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.countNumbersWithUniqueDigits(0));
        Utils.print(SOLUTION.countNumbersWithUniqueDigits(1));
        Utils.print(SOLUTION.countNumbersWithUniqueDigits(2));
        Utils.print(SOLUTION.countNumbersWithUniqueDigits(3));
    }
}