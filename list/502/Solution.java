import java.util.*;

public class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);
        int index = 0;
        for (int i = 0; i < k; i++) {
            while (index < n && arr[index][0] <= w) {
                queue.add(arr[index][1]);
                ++index;
            }
            if(!queue.isEmpty()){
                w += queue.poll();
            }else{
                break;
            }
        }
        return w;
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        boolean canTakeAllItems = true;
        for (int v : capital) {
            if (w < v) {
                canTakeAllItems = false;
                break;
            }
        }
        int num = Math.min(k, n);
        if (canTakeAllItems) {
            Arrays.sort(profits);
            for (int i = 0; i < num; i++) {
                w += profits[n - 1 - i];
            }
            return w;
        }
        for (int i = 0; i < num; i++) {
            int index = -1;
            for (int j = 0; j < n; j++) {
                if(capital[j] <= w){
                    if(index == -1 || profits[j] > profits[index]){
                        index = j;
                    }
                }
            }
            if(index == -1){
                return w;
            }
            w += profits[index];
            capital[index] = Integer.MAX_VALUE;
        }
        return w;
    }
}