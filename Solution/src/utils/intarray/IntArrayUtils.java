package utils.intarray;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static utils.Utils.randomInt;

public class IntArrayUtils {

    public static int[] array(int... v) {
        return v;
    }

    public static int[][] array(int[]... v) {
        return v;
    }

    public static int[][] array2(int k, int... v) {
        int n = v.length / k;
        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {
            System.arraycopy(v, i * k, arr[i], 0, k);
        }
        return arr;
    }

    public static String[] array(String... v) {
        return v;
    }

    public static int[] randomArray(int len) {
        return randomArray(len, 0, 100);
    }

    public static int[] randomArray(int len, int bound) {
        return randomArray(len, 0, bound - 1);
    }

    public static int[] randomArray(int len, int start, int end) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = randomInt(start, end);
        }
        return arr;
    }

    public static int[] randomArraySorted(int len) {
        return randomArraySorted(len, 0, 100);
    }

    public static int[] randomArraySorted(int len, int bound) {
        return randomArraySorted(len, 0, bound - 1);
    }

    public static int[] randomArraySorted(int len, int start, int end) {
        int[] arr = randomArray(len, start, end);
        Arrays.sort(arr);
        return arr;
    }

    public static int[] randomArrayNoRepeated(int len) {
        return randomArrayNoRepeated(len, 0, 100);
    }

    public static int[] randomArrayNoRepeated(int len, int bound) {
        return randomArrayNoRepeated(len, 0, bound - 1);
    }

    public static int[] randomArrayNoRepeated(int len, int start, int end) {
        List<Integer> list = new ArrayList<>(len);
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] randomArraySortedNoRepeated(int len) {
        return randomArraySortedNoRepeated(len, 0, 100);
    }

    public static int[] randomArraySortedNoRepeated(int len, int bound) {
        return randomArraySortedNoRepeated(len, 0, bound - 1);
    }

    public static int[] randomArraySortedNoRepeated(int len, int start, int end) {
        int[] arr = randomArrayNoRepeated(len, start, end);
        Arrays.sort(arr);
        return arr;
    }

    public static int[] randomArray01(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = randomInt(2);
        }
        return arr;
    }
}
