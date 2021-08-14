public class Solution {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[] friends = new int[n];
        for (int[] pair : pairs) {
            friends[pair[0]] = pair[1];
            friends[pair[1]] = pair[0];
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int x = i;
            int y = friends[x];

            int index = find(preferences[x], y);

            for (int j = 0; j < index; j++) {
                int u = preferences[i][j];
                int v = friends[u];

                if (find(preferences[x], u) < index && find(preferences[u], x) < find(preferences[u], v)) {
                    ++res;
                    break;
                }
            }

        }
        return res;
    }

    private int find(int[] arr, int j) {
        int n = arr.length;
        for (int k = 0; k < n; k++) {
            if (arr[k] == j) {
                return k;
            }
        }
        return n;
    }
}