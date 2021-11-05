package utils.print;

import node.ListNode;

import java.util.Arrays;

public class PrintUtils {
    public static void print(Object... obj) {
        for (Object data : obj) {
            switch (data) {
                case int[][] arr -> System.out.print(Arrays.deepToString(arr));
                case char[][] arr -> System.out.print(Arrays.deepToString(arr));
                case char[] c -> {
                    int n = c.length;
                    System.out.print("[");
                    for (int i = 0; i < n - 1; i++) {
                        System.out.print("\"" + c[i] + "\",");
                    }
                    System.out.print("\"" + c[n - 1] + "\"]");
                }
                case int[] arr -> System.out.print(Arrays.toString(arr));
                case long[] arr -> System.out.print(Arrays.toString(arr));
                case String[] strs -> {
                    System.out.print("[");
                    int n = strs.length;
                    for (int i = 0; i < n; i++) {
                        System.out.print("\"" + strs[i] + "\"" + (i == n - 1 ? "" : ","));
                    }
                    System.out.print("]");
                }
                case double[] arr -> System.out.print(Arrays.toString(arr));
                case ListNode[] arr -> System.out.print(Arrays.toString(arr));
                case String ignored -> System.out.print("\"" + data + "\"");
                default -> System.out.print(data);
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
