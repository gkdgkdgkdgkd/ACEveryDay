import java.util.*;

class Solution {
    public boolean isUgly(int n) {
        if(n > 0){
            while(n > 1){
                if(n % 5 == 0){
                    n /= 5;
                }else if(n % 3 == 0){
                    n /= 3;
                }else if(n % 2 == 0){
                    n /= 2;
                }else{
                    break;
                }
            }
            return n == 1;
        }
        return false;
    }
}