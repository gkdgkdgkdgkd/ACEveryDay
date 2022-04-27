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
        int[][] arr = Utils.strToArray2("[[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]");
        Utils.print(arr);
        Utils.print(SOLUTION.pacificAtlantic(arr));
    }
}