public class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] ct = new int[10_0000 + 1];
        for (int c : costs) {
            ++ct[c];
        }
        int res = 0;
        for (int i = 1; i <= 10_0000; i++) {
            if (ct[i] != 0) {
                if (coins >= ct[i] * i) {
                    coins -= ct[i] * i;
                    res += ct[i];
                } else {
                    res += (coins / i);
                    return res;
                }
            }
        }

        return res;
    }
}