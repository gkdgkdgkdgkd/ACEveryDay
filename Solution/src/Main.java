import utils.Utils;

import java.util.Scanner;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        // 10,6,5,5,5,3,3,3,2,2,2,2
//        int[] arr = Utils.array(10,6,5,5,5,3,3,3,2,2,2,2);
//        int[] arr = Utils.array(1,1,2,2,2);
//        int[] arr = Utils.array(5,5,5,5,16,4,4,4,4,4,3,3,3,3,4);
        int[] arr = Utils.array(3,9,2,2,2,9,10,8,3,9,10,10,1,9,9);
        Utils.print(arr);
        Utils.print(arr.length);
//        Utils.print(arr);
        Utils.print(SOLUTION.makesquare(arr));
    }
}