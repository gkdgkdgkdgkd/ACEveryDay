import java.util.Arrays;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0;
        int heaterLen = heaters.length;
        int lastDiff = houses[houses.length - 1] - heaters[heaterLen - 1];
        int i = 0;
        for (int house : houses) {
            while (i < heaterLen && heaters[i] < house) {
                ++i;
            }
            if (i > 0 && i < heaterLen) {
                res = Math.max(res, Math.min(heaters[i] - house, house - heaters[i - 1]));
            } else {
                res = Math.max(res, i == 0 ? heaters[i] - house : lastDiff);
            }
        }
        return res;
    }
}