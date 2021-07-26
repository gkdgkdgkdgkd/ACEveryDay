import java.util.*;

public class Solution {
    public int minOperations(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < target.length; i++) {
            map.put(target[i], i);
        }
        int[] d = new int[arr.length + 1];
        int len = 0;
        d[len] = -1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int tmp = map.get(arr[i]);
                int left = 0;
                int right = len;
                int pos = 0;
                while (left <= right) {
                    int mid = (left + right) >> 1;
                    if (d[mid] < tmp) {
                        pos = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                d[pos + 1] = tmp;
                len = Math.max(pos + 1, len);
            }

        }

        return target.length - len;
    }
}