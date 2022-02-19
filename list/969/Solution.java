import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int[] count = new int[101];
        int last = arr.length - 1;
        for (int v : arr) {
            ++count[v];
        }

        for (int cur = 100; cur > 0; --cur) {
            while (count[cur] > 0) {
                if (arr[last] != cur) {
                    for (int i = 0; i < last; i++) {
                        if (arr[i] == cur) {
                            reverse(arr, i);
                            res.add(i + 1);
                            break;
                        }
                    }
                    reverse(arr, last);
                    res.add(last + 1);
                }
                --count[cur];
                --last;
            }
        }
        return res;
    }

    private void reverse(int[] arr, int k) {
        int half = k >> 1;
        for (int i = 0; i <= half; i++) {
            int temp = arr[i];
            arr[i] = arr[k - i];
            arr[k - i] = temp;
        }
    }
}