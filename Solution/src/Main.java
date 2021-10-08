import node.TreeNode;
import utils.Utils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        String str = Utils.randomStr(100_000,'A','G','C','T');
//        Utils.print(str);
        int a = 0x000fffff;
        Utils.print(a);
        Utils.print(Integer.toBinaryString(a).length());
        Utils.print(Integer.lowestOneBit(a));
//        String temp = "AAAAAAAAAAA";
//        Utils.print(temp.length());
//        Utils.print(SOLUTION.findRepeatedDnaSequences(temp));
    }
}