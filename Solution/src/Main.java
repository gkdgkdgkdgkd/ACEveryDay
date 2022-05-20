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
        SOLUTION.findRightInterval(Utils.array2(2,1,4,2,3,3,4,5,6,7,9,8,10,13,20,14,20,18,20,9,10,11,13,12,13,15,16));
//        Utils.print(SOLUTION.findRightInterval(Utils.array2(2,-100,-98,-99,-97,-98,-96,-97,-95)));
//        Utils.print(SOLUTION.findRightInterval(Utils.array2(2,1,4,2,3,3,4)));
//        Utils.print(SOLUTION.findRightInterval(Utils.array2(2,1,1,3,4)));
    }
}