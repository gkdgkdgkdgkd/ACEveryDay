import utils.Utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UTFDataFormatException;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
//        Utils.print(SOLUTION.numSubarrayProductLessThanK(Utils.array(10,5,2,6),100));
//        Utils.print(SOLUTION.numSubarrayProductLessThanK(Utils.array(1,2,3),0));
//        Utils.print(Utils.randomArray(10_000,1,1000));
//        Utils.print(Utils.randomInt(0,1_000_000));
        Utils.print(SOLUTION.numSubarrayProductLessThanK(Utils.array(100,2,3,4,100,5,6,7,100),100));
    }
}