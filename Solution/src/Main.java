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
//        Utils.print(Math.toDegrees(Math.atan2(0,1)));
//        Utils.print(Math.toDegrees(Math.atan2(1,1)));
//        Utils.print(Math.toDegrees(Math.atan2(1,0)));
//        Utils.print(Math.toDegrees(Math.atan2(1,-1)));
//        Utils.print(Math.toDegrees(Math.atan2(0,-1)));
//
//        Utils.print(Math.toDegrees(Math.atan2(-1,1)));
//        Utils.print(Math.toDegrees(Math.atan2(-1,0)));
//        Utils.print(Math.toDegrees(Math.atan2(-1,-1)));
//        Utils.print(SOLUTION.convertDegree(Math.toDegrees(Math.atan2(1,1))));
//        Utils.print(SOLUTION.convertDegree(Math.toDegrees(Math.atan2(-1,1))));
//        Utils.print(SOLUTION.convertDegree(Math.toDegrees(Math.atan2(-1,-1))));
//        Utils.print(SOLUTION.convertDegree(Math.toDegrees(Math.atan2(1,-1))));
//        Utils.print(SOLUTION.outerTrees(Utils.array2(2,1,1,2,2,2,0,2,4,3,3,4,2)));
//        Utils.print(SOLUTION.outerTrees(Utils.array2(2,1,2,2,2,4,2)));
//        int[][] arr = Utils.strToArray2("[[0,2],[0,4],[0,5],[0,9],[2,1],[2,2],[2,3],[2,5],[3,1],[3,2],[3,6],[3,9],[4,2],[4,5],[5,8],[5,9],[6,3],[7,9],[8,1],[8,2],[8,5],[8,7],[9,0],[9,1],[9,6]]");
//        Utils.print(SOLUTION.outerTrees(arr));
        int[][] arr1 = Utils.strToArray2("[[0,0],[6,0],[7,0],[8,0],[10,0],[11,0],[13,0],[15,0],[17,0],[18,0],[27,0],[30,0],[39,0],[49,0],[55,0],[64,0],[86,0],[88,0],[91,0],[92,0],[94,0],[95,0],[98,3],[99,8],[99,9],[99,10],[99,13],[99,15],[99,21],[99,24],[99,29],[99,35],[99,61],[99,73],[99,81],[99,84],[99,89],[99,90],[99,91],[99,97],[96,99],[84,99],[78,99],[75,99],[74,99],[66,99],[60,99],[59,99],[57,99],[52,99],[50,99],[48,99],[47,99],[41,99],[36,99],[26,99],[24,99],[23,99],[7,99],[2,99],[0,99]]");
        int[][] arr2 = Utils.strToArray2("[[0,25],[99,73],[60,99],[0,26],[88,0],[55,0],[0,72],[0,4],[0,96],[0,40],[11,0],[0,39],[47,99],[18,0],[86,0],[0,0],[49,0],[99,21],[99,84],[0,99],[66,99],[0,89],[99,9],[74,99],[7,99],[0,32],[99,24],[99,90],[99,81],[99,13],[84,99],[15,0],[8,0],[99,35],[0,19],[26,99],[64,0],[24,99],[17,0],[99,61],[0,85],[10,0],[30,0],[39,0],[0,67],[2,99],[13,0],[78,99],[99,15],[91,0],[7,0],[99,89],[99,97],[99,8],[36,99],[0,63],[57,99],[52,99],[92,0],[75,99],[0,54],[99,29],[23,99],[99,91],[95,0],[50,99],[94,0],[6,0],[99,10],[0,55],[41,99],[59,99],[98,3],[96,99],[27,0],[0,49],[48,99],[0,22]]");
//        int[][] arr2 = Utils.strToArray2("[[3,9],[2,1],[7,9],[0,9],[9,6],[0,4],[5,9],[9,1],[0,5],[9,0],[0,2]]");
//        Set<Integer> set1 = new HashSet<>();
//        for (int[] v : arr1) {
//            set1.add(v[0] * 100 + v[1]);
//        }
//        for (int[] v : arr2) {
//            int v1 = v[0] * 100 + v[1];
//            if (!set1.contains(v1)) {
//                System.out.println("x is " + v[0] + " y is " + v[1]);
//            }
//        }
//        set1.clear();
//        for (int[] v : arr2) {
//            set1.add(v[0] * 100 + v[1]);
//        }
//        for (int[] v : arr1) {
//            int v1 = v[0] * 100 + v[1];
//            if (!set1.contains(v1)) {
//                System.out.println("x is " + v[0] + " y is " + v[1]);
//            }
//        }
    }
}