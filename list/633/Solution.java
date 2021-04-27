public class Solution {
    public boolean judgeSquareSum(int c) {
        if(c <= 5){
            return c != 3;
        }
        int a = 0;
        int b = (int)Math.sqrt(c);
        while (a <= b){
            int sum = a*a + b*b;
            if(sum == c){
                return true;
            }else if(sum > c){
                --b;
            }else{
                ++a;
            }
        }
        return false;
    }
}