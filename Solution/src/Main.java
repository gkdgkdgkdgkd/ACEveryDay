import utils.Utils;

import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Utils.print(Utils.randomInt(-10_000_000,10_000_000));
        }
    }
}