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
        int cur = 0;
        for (int i = 0; i < 20; i++) {
            cur <<= 1;
            cur |= 1;
        }
        Utils.print(cur);
    }
}