import utils.Utils;

import java.util.Arrays;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.minRefuelStops(100,50,Utils.array2(2,25,25,50,50)));
    }
}
