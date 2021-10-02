public class Solution {
    private static final long[] base = {1, 16, 256, 4096, 65536, 1048576, 16777216, 268435456};

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        int i = base.length - 1;
        long cur = num;
        if (num < 0) {
            cur += 0x80000000L << 1;
        }
        StringBuilder builder = new StringBuilder();
        while (i >= 0) {
            if (cur >= base[i]) {
                int count = (int) (cur / base[i]);
                cur -= count * base[i];
                builder.append((char) (count >= 10 ? 'a' + (count - 10) : '0' + count));
            } else if (builder.length() > 0) {
                builder.append(0);
            }
            --i;
        }
        return builder.toString();
    }
}