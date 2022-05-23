import node.TreeNode;
import utils.Utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.Console;
import java.io.UTFDataFormatException;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
//        Utils.print(SOLUTION.cutOffTree(Utils.listOf(Utils.listOf(1,3,1),Utils.listOf(0,1,1),Utils.listOf(0,1,2))));
//        Utils.print(SOLUTION.cutOffTree(Utils.listOf(Utils.listOf(9,2,3),Utils.listOf(0,0,4),Utils.listOf(7,6,5))));
        Utils.print(Utils.array2(30,Utils.randomArrayNoRepeated(40*30,1,10_000_000)));
//        var list = Utils.list2(3, Utils.randomArrayNoRepeated(5*3,1,1_000_0));
//        var list = Utils.list2(3, Utils.array(2,5,9,4,6,7,8,13,12,11,10,3));
//        Utils.print(list);
//        Utils.print(SOLUTION.cutOffTree(list));
    }
}