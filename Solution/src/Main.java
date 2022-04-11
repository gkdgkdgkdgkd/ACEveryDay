import utils.Utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(Utils.randomArray(26,2,10));
        Utils.print(Utils.randomLowercaseStr(1000));
    }
}