public class Solution extends GuessGame{
    public int guessNumber(int n) {
        long left = 1;
        long right = n;
        while(left < right){
            int m = (int)((left+right) >> 1);
            int result = guess(m);
            if(result == 0){
                return m;
            }
            if(result == -1){
                right = m;
            }else{
                left = m+1;
            }
        }
        return (int)left;
    }
}