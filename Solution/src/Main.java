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
        System.out.println((char) 10_000);
        System.out.println((char) 9999);
        System.out.println((int)Character.MAX_VALUE);
        char c = 9999;
        System.out.println((int)c);
        TreeNode node = new TreeNode(100);
        node.left = new TreeNode(50);
        node.left.left = new TreeNode(30);
        node.left.left.left = new TreeNode(20);
        Codec codec = new Codec();
        String str = codec.serialize(node);
        Utils.print(str);
        TreeNode root = codec.deserialize(str);
        Utils.print(root);
    }
}