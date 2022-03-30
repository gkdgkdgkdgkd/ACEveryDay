import utils.Utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        Utils.print(SOLUTION.busiestServers(3,Utils.array(1,2,3,4,5),Utils.array(5,2,3,3,3)));
//        Utils.print(SOLUTION.busiestServers(3,Utils.array(1,2,3,4,8,9,10),Utils.array(5,2,10,3,1,2,2)));
//        Utils.print(SOLUTION.busiestServers(3,Utils.array(1,2,3,4),Utils.array(1,2,1,2)));
        Utils.print(SOLUTION.busiestServers(2,Utils.array(1,3,5,6,7,12),Utils.array(3,4,6,5,5,6)));
    }
}