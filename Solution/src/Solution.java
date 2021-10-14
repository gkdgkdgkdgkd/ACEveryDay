import java.util.*;

public class Solution {
    public int openLock(String[] strDead, String strTarget) {
        final boolean[] dead = new boolean[10000];
        final boolean[] visit = new boolean[10000];
        final Queue<Integer> queue = new LinkedList<>();
        int target = getNumFromStr(strTarget);
        if (target == 0) {
            return 0;
        }
        for (String str : strDead) {
            dead[getNumFromStr(str)] = true;
        }
        if (dead[0]) {
            return -1;
        }

        queue.add(0);
        visit[0] = true;
        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                if (num == target) {
                    return res;
                }
                int[] arr = new int[4];
                arr[3] = num % 10;
                num /= 10;
                arr[2] = num % 10;
                num /= 10;
                arr[1] = num % 10;
                num /= 10;
                arr[0] = num % 10;
                for (int j = 0; j < 4; j++) {
                    int origin = arr[j];
                    arr[j] = arr[j] + 1 > 9 ? 0 : arr[j] + 1;
                    int changeNum = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
                    if (!dead[changeNum] && !visit[changeNum]) {
                        queue.add(changeNum);
                        visit[changeNum] = true;
                    }
                    arr[j] = origin;

                    arr[j] = arr[j] - 1 < 0 ? 9 : arr[j] - 1;
                    changeNum = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
                    if (!dead[changeNum] && !visit[changeNum]) {
                        queue.add(changeNum);
                        visit[changeNum] = true;
                    }
                    arr[j] = origin;
                }
            }
            ++res;
        }
        return -1;
    }

    private int getNumFromStr(String str) {
        return (str.charAt(0) - '0') * 1000 + (str.charAt(1) - '0') * 100 + (str.charAt(2) - '0') * 10 + (str.charAt(3) - '0');
    }
}