import node.Node;
import utils.Utils;

import javax.xml.crypto.AlgorithmMethod;
import java.math.BigInteger;
import java.security.AlgorithmConstraints;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.child = new Node(3);
        SOLUTION.flatten(node);
    }
}