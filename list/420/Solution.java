public class Solution {
    public int strongPasswordChecker(String password) {
        char[] c = password.toCharArray();
        int n = c.length;
        int lower = 0;
        int upper = 0;
        int digit = 0;
        for (char value : c) {
            if (value >= 'a' && value <= 'z') {
                lower = 1;
            } else if (value >= 'A' && value <= 'Z') {
                upper = 1;
            } else if (value >= '0' && value <= '9') {
                digit = 1;
            }
            if (lower > 0 && upper > 0 && digit > 0) {
                break;
            }
        }
        int count = lower + upper + digit;
        if (n < 6) {
            return Math.max(6 - n, 3 - count);
        }
        int repeat = 0;
        if (n <= 20) {
            for (int i = 0; i < n; ) {
                int j = i;
                while (j < n && c[j] == c[i]) {
                    ++j;
                }
                int temp = j - i;
                if (temp >= 3) {
                    repeat += temp / 3;
                }
                i = j;
            }
            return Math.max(repeat, 3 - count);
        }
        int[] temp = new int[3];
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && c[j] == c[i]) {
                ++j;
            }
            int cnt = j - i;
            if (cnt >= 3) {
                repeat += cnt / 3;
                ++temp[cnt % 3];
            }
            i = j;
        }
        int delete = n - 20;
        int cur = delete;
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                temp[i] = repeat;
            }
            if (temp[i] != 0 && cur != 0) {
                int t = Math.min(temp[i] * (i + 1), cur);
                cur -= t;
                repeat -= t / (i + 1);
            }
        }
        return delete + Math.max(repeat, 3 - count);
    }
}