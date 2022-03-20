import utils.Utils;

import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.networkBecomesIdle(Utils.array2(2,0,1,1,2),Utils.array(0,2,1)));
        Utils.print(SOLUTION.networkBecomesIdle(Utils.array2(2,0,1,1,2,0,2),Utils.array(0,10,10)));
    }
}