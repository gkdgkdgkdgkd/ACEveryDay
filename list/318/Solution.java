public class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];
        int[] len = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = words[i].length();
            for (int j = 0; j < len[i]; j++) {
                mask[i] |= (1 << words[i].charAt(j) - 'a');
            }
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if ((mask[i] & mask[j]) == 0) {
                    temp = Math.max(temp, len[j]);
                }
            }
            res = Math.max(temp * len[i], res);
        }
        return res;
    }
}