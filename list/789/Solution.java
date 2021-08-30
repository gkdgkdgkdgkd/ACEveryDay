public class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int x = target[0];
        int y = target[1];
        int res = Math.abs(x) + Math.abs(y);
        for (int[] g : ghosts) {
            if(Math.abs(g[0] - x) + Math.abs(g[1] - y) <= res){
                return false;
            }
        }
        return true;
    }
}