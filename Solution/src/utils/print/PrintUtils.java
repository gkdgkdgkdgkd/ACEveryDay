package utils.print;

import node.ListNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class PrintUtils {
    private static final Map<Class<?>, Consumer<Object>> map = new HashMap<>();

    static {
        map.put(char[].class, o -> {
            char[] c = (char[]) o;
            int n = c.length;
            System.out.print("[");
            for (int i = 0; i < n - 1; i++) {
                System.out.print("\"" + c[i] + "\",");
            }
            System.out.print("\"" + c[n - 1] + "\"]");
        });
        map.put(String[].class, o -> {
            String[] str = (String[]) o;
            System.out.print("[");
            int n = str.length;
            for (int i = 0; i < n; i++) {
                System.out.print("\"" + str[i] + "\"" + (i == n - 1 ? "" : ","));
            }
            System.out.print("]");
        });
        map.put(int[].class, o -> System.out.print(Arrays.toString((int[]) o)));
        map.put(long[].class, o -> System.out.print(Arrays.toString((long[]) o)));
        map.put(double[].class, o -> System.out.print(Arrays.toString((double[]) o)));
        map.put(ListNode[].class, o -> System.out.print(Arrays.toString((ListNode[]) o)));
        map.put(int[][].class, o -> System.out.print(Arrays.deepToString((int[][]) o)));
        map.put(char[][].class, o -> System.out.print(Arrays.deepToString((char[][]) o)));
        map.put(String.class, o -> System.out.print("\"" + o + "\""));
    }

    public static void print(Object obj, boolean split) {
        if (obj == null) {
            System.out.println("null");
            return;
        }
        if (obj instanceof String[] str && split) {
            for (String s : str) {
                System.out.println(s);
            }
            return;
        }
        map.getOrDefault(obj.getClass(), System.out::println).accept(obj);
        System.out.println();
    }
}
