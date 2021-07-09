public class Solution {
    public int romanToInt(String s) {
        char [] ch = s.toCharArray();
        int n = ch.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(ch[i] == 'M'){
                sum += 1000;
            }else if(ch[i] == 'D'){
                sum += 500;
            }else if(ch[i] == 'C'){
                if(i+1 < n){
                    if(ch[i+1] == 'D') {
                        sum += 300;
                        ++i;
                    }else if(ch[i+1] == 'M'){
                        sum += 800;
                        ++i;
                    }
                }
                sum += 100;
            }else if(ch[i] == 'L'){
                sum += 50;
            }else if(ch[i] == 'X'){
                if(i+1 < n){
                    if(ch[i+1] == 'L') {
                        sum += 30;
                        ++i;
                    }else if(ch[i+1] == 'C'){
                        sum += 80;
                        ++i;
                    }
                }
                sum += 10;
            }else if(ch[i] == 'V'){
                sum += 5;
            }else{
                if(i+1 < n){
                    if(ch[i+1] == 'V') {
                        sum += 3;
                        ++i;
                    }else if(ch[i+1] == 'X'){
                        sum += 8;
                        ++i;
                    }
                }
                sum += 1;
            }
        }
        return sum;
    }
}