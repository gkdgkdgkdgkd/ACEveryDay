public class Solution {
    public int xorOperation(int n, int start) {
        int end = start + 2*(n-1);
        int result = start;
        for (int i = start+2;i<=end;i+=2){
            result ^= i;
        }
        return result;
    }
}