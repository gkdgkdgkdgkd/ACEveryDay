import utils.Utils;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        for (long a = 9_999_999; a >= 9_000_000; --a) {
//            boolean find = false;
            for (long b = 9_999_999; b >= 9_000_000; --b) {
                boolean isBreak = false;
                String c = String.valueOf(a * b);
                for (int i = 0, n = c.length(); i < (n >> 1); i++) {
                    if (c.charAt(i) != c.charAt(n - i - 1)) {
                        isBreak = true;
                        break;
                    }
                }
                if (!isBreak) {
//                    find = true;
                    System.out.println("a is " + a + " b is " + b);
                    System.out.println(c);
                    System.out.println("(a % 1337 * b % 1337) % 1337 is " + (((a % 1337) * (b % 1337)) % 1337));
                    break;
                }
            }
//            if (find) {
//                break;
//            }
        }
    }
}