import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
//        int []c = {16,38,8,41,30,31,14,45,3,2,24,23,38,30,31,17,35,4,9,42,28,18,37,18,14,46,11,13,19,3,5,39,24,48,20,29,4,19,36,11,28,49,38,16,23,24,4,22,29,35,45,38,37,40,2,37,8,41,33,8,40,27,13,4,33,5,8,14,19,35,31,8,8};
//        int [][]cc = {{43,1054,49}};
//        System.out.println(Arrays.toString(solution.canEat(c,cc)));
//        int []c = {46,5,47,48,43,34,15,26,11,25,41,47,15,25,16,50,32,42,32,21,36,34,50,45,46,15,46,38,50,12,3,26,26,16,23,1,4,48,47,32,47,16,33,23,38,2,19,50,6,19,29,3,27,12,6,22,33,28,7,10,12,8,13,24,21,38,43,26,35,18,34,3,14,48,50,34,38,4,50,26,5,35,11,2,35,9,11,31,36,20,21,37,18,34,34,10,21,8,5};
//        int [][]cc = {{85,54,42}};
//        System.out.println(Arrays.toString(solution.canEat(c,cc)));
        System.out.println(Arrays.toString(solution.canEat(new int[]{1},new int[][]{
                {0,0,3},
                {0,1,10},
        })));
    }
}