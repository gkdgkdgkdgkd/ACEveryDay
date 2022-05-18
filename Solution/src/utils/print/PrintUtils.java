package utils.print;

import node.ListNode;

import java.util.Arrays;

public class PrintUtils {
    public static void print(Object obj) {
        if (obj == null) {
            System.out.println("null");
            return;
        }
        if (obj instanceof int[][] arr) {
            System.out.print(Arrays.deepToString(arr));
        } else if (obj instanceof char[][] arr) {
            System.out.print(Arrays.deepToString(arr));
        } else if (obj instanceof char[] c) {
            int n = c.length;
            System.out.print("[");
            for (int i = 0; i < n - 1; i++) {
                System.out.print("\"" + c[i] + "\",");
            }
            System.out.print("\"" + c[n - 1] + "\"]");
        } else if (obj instanceof int[] arr) {
            System.out.print(Arrays.toString(arr));
        } else if (obj instanceof long[] arr) {
            System.out.print(Arrays.toString(arr));
        } else if (obj instanceof String[] strs) {
            System.out.print("[");
            int n = strs.length;
            for (int i = 0; i < n; i++) {
                System.out.print("\"" + strs[i] + "\"" + (i == n - 1 ? "" : ","));
            }
            System.out.print("]");
        } else if (obj instanceof double[] arr) {
            System.out.print(Arrays.toString(arr));
        } else if (obj instanceof ListNode[] arr) {
            System.out.print(Arrays.toString(arr));
        } else if (obj instanceof String str) {
            System.out.print("\"" + str + "\"");
        } else {
            System.out.print(obj);
        }
        System.out.println();
    }
}
