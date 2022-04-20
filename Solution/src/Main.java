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
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) throws Exception {
        Utils.print(SOLUTION.lengthLongestPath("a"));
        Utils.print(SOLUTION.lengthLongestPath("file1.txt\nfile2.txt\nlongfile.txt"));
        Utils.print(SOLUTION.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
    }
}