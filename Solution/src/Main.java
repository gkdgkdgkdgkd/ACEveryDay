import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int []a = {1,1,1,1};
        int len = new Solution().removeElement(a,1);
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }
}