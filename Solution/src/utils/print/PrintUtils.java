package utils.print;

import node.ListNode;

import java.util.Arrays;

public class PrintUtils {
    public static void print(Object data) {
        if (data instanceof int[][] arr) {
            System.out.println(Arrays.deepToString(arr));
        } else if (data instanceof char[][] arr) {
            System.out.println(Arrays.deepToString(arr));
        } else if (data instanceof char[] c) {
            int n = c.length;
            System.out.print("[");
            for (int i = 0; i < n - 1; i++) {
                System.out.print("\"" + c[i] + "\",");
            }
            System.out.println("\"" + c[n - 1] + "\"]");
        } else if (data instanceof int[] arr) {
            System.out.println(Arrays.toString(arr));
        } else if (data instanceof long[] arr) {
            System.out.println(Arrays.toString(arr));
        } else if (data instanceof String[] strs) {
            System.out.print("[");
            int n = strs.length;
            for (int i = 0; i < n; i++) {
                System.out.print("\"" + strs[i] + "\"" + (i == n - 1 ? "" : ","));
            }
            System.out.println("]");
        } else if (data instanceof double[] arr) {
            System.out.println(Arrays.toString(arr));
        } else if (data instanceof ListNode[] arr) {
            System.out.println(Arrays.toString(arr));
        } else if (data instanceof String) {
            System.out.println("\"" + data + "\"");
        } else {
            System.out.println(data);
        }
    }
}
