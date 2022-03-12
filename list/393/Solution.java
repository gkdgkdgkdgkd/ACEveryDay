public class Solution {
    public boolean validUtf8(int[] data) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            int count = check1(data[i]);
            if (count == -1) {
                return false;
            }
            if (i + count < n) {
                for (int j = 1; j <= count; j++) {
                    if (!check10(data[i + j])) {
                        return false;
                    }
                }
                i += count;
            } else {
                return false;
            }
        }
        return true;
    }

    private int check1(int v) {
        if ((v & 128) == 0) {
            return 0;
        }
        if ((v & 128) == 128 && (v & 64) == 64) {
            if ((v & 32) == 0) {
                return 1;
            }
            if ((v & 32) == 32) {
                if ((v & 16) == 0) {
                    return 2;
                }
                if ((v & 16) == 16) {
                    if ((v & 8) == 0) {
                        return 3;
                    }
                }
            }
        }
        return -1;
    }

    private boolean check10(int v) {
        return (v & 128) == 128 && (v & 64) == 0;
    }
}