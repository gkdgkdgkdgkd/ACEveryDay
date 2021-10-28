import java.util.*;

public class Solution {
    private static final int[][] map = {
        {},
        {1, 2, 4, 8},
        {16, 32, 64},
        {128, 256, 512},
        {1024, 2048, 4096, 8192},
        {16384, 32768, 65536},
        {131072, 262144, 524288},
        {1048576, 2097152, 4194304, 8388608},
        {16777216, 33554432, 67108864},
        {134217728, 268435456, 536870912}
    };

    public boolean reorderedPowerOf2(int n) {
        int[] count = new int[10];
        int digit = 0;
        while (n > 0) {
            ++count[n % 10];
            n /= 10;
            ++digit;
        }
        for (int candidate : map[digit]) {
            int[] originCount = Arrays.copyOf(count, 10);
            while (candidate > 0) {
                if (--count[candidate % 10] < 0) {
                    break;
                }
                candidate /= 10;
            }
            if (candidate == 0) {
                return true;
            }
            count = originCount;
        }
        return false;
    }
}