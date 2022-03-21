public class Solution {
    public boolean winnerOfGame(String colors) {
        char[] c = colors.toCharArray();
        int a = 0;
        int b = 0;
        for (int i = 0, n = c.length; i < n; ) {
            int temp = 0;
            for (; i < n && c[i] == 'A'; ++i, ++temp)
                ;
            a += Math.max(temp - 2, 0);
            for (temp = 0; i < n && c[i] == 'B'; ++i, ++temp)
                ;
            b += Math.max(temp - 2, 0);
        }
        return a > b;
    }
}