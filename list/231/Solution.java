import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n < 1 ? false : (n & (n - 1)) == 0;
    }
}