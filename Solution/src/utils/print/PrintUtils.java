package utils.print;

import java.util.Arrays;

public class PrintUtils {
    public static void print(Object data) {
        if (data instanceof int[][]) {
            System.out.println(Arrays.deepToString((int[][]) data));
        } else if (data instanceof char[][]) {
            System.out.println(Arrays.deepToString((char[][]) data));
        } else if (data instanceof char[]) {
            char[] c = (char[]) data;
            int n = c.length;
            System.out.print("[");
            for (int i = 0; i < n - 1; i++) {
                System.out.print("\"" + c[i] + "\",");
            }
            System.out.println("\"" + c[n - 1] + "\"]");
        } else if (data instanceof int[]) {
            System.out.println(Arrays.toString((int[]) data));
        } else if (data instanceof String[]) {
            String[] strs = (String[]) data;
            System.out.print("[");
            int n = strs.length;
            for (int i = 0; i < n; i++) {
                System.out.print("\"" + strs[i] + "\"" + (i == n - 1 ? "" : ","));
            }
            System.out.println("]");
        } else if (data instanceof double[]) {
            System.out.println(Arrays.toString((double[]) data));
        } else if (data instanceof String) {
            System.out.println("\"" + data + "\"");
        } else {
            System.out.println(data);
        }
    }
}
