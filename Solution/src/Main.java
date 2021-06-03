import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
//        int [] a = {0,1,0,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,0,0,0,1,1};
//        System.out.println(a.length);
//        System.out.println(solution.findMaxLength(a));
        System.out.println(solution.findMaxLength(new int[]{0,1,0,0,1,0,0,
        1,0,0,1,1,0,0,1,0,0,1,1,
        0,0,0,1,0,1}));
        System.out.println(solution.findMaxLength(new int[]{0,0,1}));
//        System.out.println(solution.findMaxLength(new int[]{1,0,1}));
//        System.out.println(solution.findMaxLength(new int[]{0,1,0}));
//        System.out.println(solution.findMaxLength(new int[]{0,0,1,0,0,0,1,1}));
//        System.out.println(solution.findMaxLength(new int[]{0,0,0,1,1,1,0}));
//        System.out.println(solution.findMaxLength(new int[]{0,0,0,1,1,1,0,1,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0}));
    }
}