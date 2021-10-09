import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    private final int[] arr = new int[100_001];
    private int size = 0;
    private int[][] cacheRes;
    private int modifyNum = 0;

    public void addNum(int val) {
        int[] arr = this.arr;
        if (size == 0) {
            arr[0] = val;
            ++size;
            ++modifyNum;
            return;
        }
        int l = 0;
        int r = size - 1;
        while (l < r) {
            int m = (l + r) >>> 1;
            int v = arr[m];
            if (v == val) {
                return;
            }
            if (v > val) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (arr[l] == val) {
            return;
        }
        if (arr[l] > val) {
            System.arraycopy(arr, l, arr, l + 1, size - l);
            arr[l] = val;
        } else {
            System.arraycopy(arr, l + 1, arr, l + 2, size - l - 1);
            arr[l + 1] = val;
        }
        ++modifyNum;
        ++size;
    }

    public int[][] getIntervals() {
        if (modifyNum == 0) {
            return cacheRes;
        }
        List<int[]> list = new ArrayList<>();
        int[] arr = this.arr;
        int n = size;
        for (int i = 0; i < n; i++) {
            int start = i;
            while (i + 1 < n && arr[i+1] == arr[i] + 1) {
                ++i;
            }
            list.add(new int[]{arr[start], arr[i]});
        }
        n = list.size();
        int[][] res = new int[n][2];
        for (int i = 0; i < n; i++) {
            res[i] = list.get(i);
        }
        modifyNum = 0;
        return this.cacheRes = res;
    }
}