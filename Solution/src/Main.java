import utils.Utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.deserialize("[123,456,[788,799,833],[[]],10,[]]"));
    }
}