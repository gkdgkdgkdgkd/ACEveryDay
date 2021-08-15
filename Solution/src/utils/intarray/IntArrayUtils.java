package utils.intarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public static int[] randomArrayNoRepeated(int len) {
        int[] arr = new int[len];
        Set<Integer> set = new HashSet<>(len);
        for (int i = 0; i < len; i++) {
            int num = randomInt();
            while (set.contains(num)) {
                num = randomInt();
            }
            set.add(num);
            arr[i] = num;
        }
        return arr;
    }

    public static int[] randomArrayNoRepeated(int len, int bound) {
        int[] arr = new int[len];
        Set<Integer> set = new HashSet<>(len);
        for (int i = 0; i < len; i++) {
            int num = randomInt(bound);
            while (set.contains(num)) {
                num = randomInt(bound);
            }
            set.add(num);
            arr[i] = num;
        }
        return arr;
    }

    public static int[] randomArrayNoRepeated(int len, int start, int end) {
        int[] arr = new int[len];
        Set<Integer> set = new HashSet<>(len);
        for (int i = 0; i < len; i++) {
            int num = randomInt(start,end);
            while (set.contains(num)) {
                num = randomInt(start, end);
            }
            set.add(num);
            arr[i] = num;
        }
        return arr;
    }

    public static int[] randomArraySortedNoRepeated(int len){
        int[] arr = randomArrayNoRepeated(len);
        Arrays.sort(arr);
        return arr;
    }

    public static int[] randomArraySortedNoRepeated(int len,int bound) {
        int[] arr = randomArrayNoRepeated(len,bound);
        Arrays.sort(arr);
        return arr;
    }

    public static int[] randomArraySortedNoRepeated(int len,int start,int end) {
        int[] arr = randomArrayNoRepeated(len,start,end);
        Arrays.sort(arr);
        return arr;
    }
}
