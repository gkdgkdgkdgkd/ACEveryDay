import utils.Utils;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        for (long i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if(SOLUTION.isPowerOfThree((int)i)){
                Utils.print(i);
            }
        }
    }
}