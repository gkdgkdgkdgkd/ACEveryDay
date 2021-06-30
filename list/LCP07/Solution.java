import java.util.*;

public class Solution {
    public int numWays(int n, int[][] relation, int k) {
        int [][] map = new int[n][];
        int [] mapLen = new int[n];
        int [] mapIndex = new int[n];

        for (int i = 0; i < relation.length; i++) {
            ++mapLen[relation[i][0]];
        }

        for (int i = 0; i < relation.length; i++) {
            int fromPlayer = relation[i][0];
            int toPlayer = relation[i][1];
            if(map[fromPlayer] == null){
                map[fromPlayer] = new int[mapLen[fromPlayer]];
                map[fromPlayer][0] = toPlayer;
                mapIndex[fromPlayer] = 1;
            }else{
                map[fromPlayer][mapIndex[fromPlayer]++] = toPlayer;
            }
        }

        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        for (int i = 0; i < k; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int current = queue.remove();
                int [] value = map[current];
                if(value != null){
                    for (int l = 0; l < value.length; l++) {
                        int v = value[l];
                        if(i == k-1 && v == n-1){
                            ++res;
                        }
                        queue.add(v);
                    }
                }
            }
        }
        return res;
    }
}