import utils.Utils;

import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.subArrayRanges(Utils.array(1,2,3)));
    }
}