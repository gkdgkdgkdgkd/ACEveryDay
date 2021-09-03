import java.util.*;

public class Solution {
    private static final Random random = new Random();

    public int[] smallestK(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1, k);
        return Arrays.copyOfRange(arr, 0, k);
    }

    private void quickSort(int[] arr, int l, int r, int k) {
        if (l >= r) {
            return;
        }
        int i = l;
        int j = r;
        swap(arr, random.nextInt(r - l + 1) + l, l);
        int x = arr[l];
        while (i < j) {
            while (i < j && arr[j] >= x) {
                --j;
            }
            while (i < j && arr[i] <= x) {
                ++i;
            }
            swap(arr, i, j);
        }
        swap(arr, i, l);
        if (i > k) {
            quickSort(arr, l, i - 1, k);
        }
        if (i < k) {
            quickSort(arr, i + 1, r, k);
        }
    }

    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}