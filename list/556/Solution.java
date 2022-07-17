public class Solution {
    public int nextGreaterElement(int nn) {
        long n = nn;
        int pre = (int) (n % 10);
        n /= 10;
        int[] count = new int[10];
        ++count[pre];
        while (n > 0) {
            int next = (int) (n % 10);
            n /= 10;
            if (next < pre) {
                ++count[next];
                n *= 10;
                for (int i = 1; i < 10; i++) {
                    if (i > next && count[i] > 0) {
                        --count[i];
                        long sum = i;
                        for (int j = 0; j < 10; j++) {
                            while (count[j] > 0) {
                                sum *= 10;
                                sum += j;
                                --count[j];
                                n *= 10;
                            }
                        }
                        long res = n + sum;
                        if (res > Integer.MAX_VALUE) {
                            return -1;
                        } else {
                            return (int) res;
                        }
                    }
                }
                return -1;
            } else {
                pre = next;
                ++count[pre];
            }
        }
        return -1;
    }
}
