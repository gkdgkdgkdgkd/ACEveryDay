public class Solution {
    private static final int SHIFT = 100_000;
    public int[] restoreArray(int[][] adjacentPairs) {
        Node[] map = new Node[(SHIFT<<1) + 1];
        for (int[] arr : adjacentPairs) {
            int v1 = arr[0] + SHIFT;
            int v2 = arr[1] + SHIFT;
            if (map[v1] == null) {
                map[v1] = new Node();
            }
            if (map[v2] == null) {
                map[v2] = new Node();
            }
            if(map[v1].v1 == Integer.MAX_VALUE){
                map[v1].v1 = arr[1];
            }else{
                map[v1].v2 = arr[1];
            }
            if(map[v2].v1 == Integer.MAX_VALUE){
                map[v2].v1 = arr[0];
            }else{
                map[v2].v2 = arr[0];
            }
//            map[v1].add(arr[1]);
//            map[v2].add(arr[0]);
        }

        int n = adjacentPairs.length + 1;
        int[] res = new int[n];

        for (int i = 0; i <= 2 * SHIFT; i++) {
            Node node = map[i];
//            if (node != null && node.size() == 1){
            if (node != null && ((node.v1 == Integer.MAX_VALUE && node.v2 != Integer.MAX_VALUE) || (node.v2 == Integer.MAX_VALUE && node.v1 != Integer.MAX_VALUE))){
                res[0] = i - SHIFT;
                break;
            }
        }

        res[1] = map[res[0] + SHIFT].v1;
        for (int i = 2; i < n; i++) {
            Node v = map[res[i - 1] + SHIFT];
            res[i] = (res[i - 2] == v.v1 ? v.v2 : v.v1);
        }
        return res;
    }

    private static class Node {
        int v1 = Integer.MAX_VALUE;
        int v2 = Integer.MAX_VALUE;

        public void add(int v) {
            if (v1 == Integer.MAX_VALUE) {
                v1 = v;
            } else {
                v2 = v;
            }
        }

        public int size() {
            return (v1 == Integer.MAX_VALUE ? 0 : 1) + (v2 == Integer.MAX_VALUE ? 0 : 1);
        }
    }
}