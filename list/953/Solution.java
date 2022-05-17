public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0, n = order.length(); i < n; i++) {
            index[order.charAt(i) - 'a'] = i;
        }
        String pre = words[0];
        for (int i = 1, n = words.length; i < n; i++) {
            int l1 = pre.length();
            int l2 = words[i].length();
            int j = 0;
            int k = 0;
            for (; j < l1 && k < l2; ++j, ++k) {
                char c1 = pre.charAt(j);
                char c2 = words[i].charAt(k);
                if (c1 == c2) {
                    continue;
                }
                if (index[c1 - 'a'] > index[c2 - 'a']) {
                    return false;
                } else {
                    j = l1;
                    break;
                }
            }
            if (j < l1) {
                return false;
            }
            pre = words[i];
        }
        return true;
    }
}