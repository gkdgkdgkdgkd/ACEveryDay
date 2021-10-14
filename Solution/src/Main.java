import utils.Utils;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) {
        Utils.print(SOLUTION.openLock(Utils.array("0201","0101","0102","1212","2002"),"0202"));
//        Utils.print(SOLUTION.openLock(Utils.array("8888"),"0009"));
    }
}