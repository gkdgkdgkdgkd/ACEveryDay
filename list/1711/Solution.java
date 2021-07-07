public class Solution {
    public int countPairs(int[] deliciousness) {
        long ans = 0;
        int max = deliciousness[0];
        int min = deliciousness[0];
        for (int v : deliciousness) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        int[] map = new int[max - min + 1];
        for (int v : deliciousness) {
            for (int s = 1; ; s <<= 1) {
                int x = s - v;
                if(x < min){
                    continue;
                }
                if(x > max){
                    break;
                }
                ans += map[x-min];
            }
            ++map[v-min];
        }
        return (int)(ans % 1_000_000_007L);
    }
}