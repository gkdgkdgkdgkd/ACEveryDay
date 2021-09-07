import node.*;
import utils.*;

import java.math.*;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        String str = Utils.randomStr(1000, 'L', 'R');
        while (!check(str)){
            str = Utils.randomStr(1000,'L','R');
        }
        Utils.print(str);
    }

    private static boolean check(String str) {
        int l = 0;
        int r = 0;
        for (char c : str.toCharArray()) {
            if (c == 'L') {
                ++l;
            } else {
                ++r;
            }
        }
        return l == r;
    }
}