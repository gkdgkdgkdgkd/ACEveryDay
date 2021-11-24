public class Solution {
    public String originalDigits(String s) {
        int[] n = new int[10];
        char[] c = s.toCharArray();
        int[] count = new int[128];
        for (char cc : c) {
            ++count[cc];
        }
        n[0] = count['z'];
        n[2] = count['w'];
        n[4] = count['u'];
        n[6] = count['x'];
        n[8] = count['g'];
        n[3] = count['h'] - n[8];
        n[5] = count['f'] - n[4];
        n[7] = count['s'] - n[6];
        n[1] = count['o'] - n[0] - n[2] - n[4];
        n[9] = count['i'] - n[5] - n[6] - n[8];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(String.valueOf(i).repeat(Math.max(0, n[i])));
        }
        return builder.toString();
    }
}