import utils.Utils;

import java.util.*;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        String str = Utils.randomStr(16, 'R', 'Y');
        String str = "RRYGGYYRRYYGGYRR";
//        str = new String(SOLUTION.addAndRemove(str.toCharArray(),0,' '));
//        String hand = Utils.randomStr(5, 'R', 'Y');
        String hand = "GGBBB";
        Utils.print(str);
        Utils.print(hand);
        Utils.print(SOLUTION.findMinStep(str, hand));
    }
}