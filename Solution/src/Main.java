import utils.Utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        Utils.print(SOLUTION.binaryGap(22));
        Utils.print(SOLUTION.binaryGap(8));
        Utils.print(SOLUTION.binaryGap(5));
    }
}