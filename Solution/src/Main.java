import utils.Utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        BigInteger res = new BigInteger("1");
        int n = 50;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(new BigInteger(String.valueOf(i)));
            Utils.print(i+"! = "+res);
            Utils.print(SOLUTION.trailingZeroes(i));
        }
    }
}