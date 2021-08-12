package utils.intarray;

import java.util.Arrays;

import static utils.Utils.randomInt;

public class IntArrayUtils {

    public static int[] array(int... v) {
        return v;
    }

    public static String[] array(String... v) {
        return v;
    }

    public static int[] randomArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = randomInt();
        }
        return arr;
    }

    public static int[] randomArray(int len, int bound) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = randomInt(bound);
        }
        return arr;
    }

    public static int[] randomArray(int len, int start, int end) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = randomInt(start, end);
        }
        return arr;
    }

    public static int[] randomArraySorted(int len) {
        int[] arr = randomArray(len);
        Arrays.sort(arr);
        return arr;
    }

    public static int[] randomArraySorted(int len, int bound) {
        int[] arr = randomArray(len, bound);
        Arrays.sort(arr);
        return arr;
    }

    public static int[] randomArraySorted(int len, int start, int end) {
        int[] arr = randomArray(len, start, end);
        Arrays.sort(arr);
        return arr;

    }
}
