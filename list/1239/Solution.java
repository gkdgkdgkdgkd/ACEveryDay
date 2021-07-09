import java.util.List;

public class Solution {
    private int ans = 0;

    public int maxLength(List<String> arr) {
        int n = arr.size();
        int [] masks = new int[n];
        int index = 0;
        for (String s : arr) {
            int mask = 0;
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i) - 'a';
                if (((mask >> ch) & 1) != 0) {
                    mask = 0;
                    break;
                }
                mask |= 1 << ch;
            }
            if (mask > 0) {
                masks[index++] = mask;
            }
        }
        backtrack(0,0,masks,index);
        return ans;
    }

    private void backtrack(int pos, int mask,int []masks,int n) {
        if (pos == n){
            ans = Math.max(ans, Integer.bitCount(mask));
            return;
        }

        if ((mask & masks[pos]) == 0) {
            backtrack(pos + 1, mask | masks[pos],masks,n);
        }
        backtrack(pos + 1, mask,masks,n);
    }
}