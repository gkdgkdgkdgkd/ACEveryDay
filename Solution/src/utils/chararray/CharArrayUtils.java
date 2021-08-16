package utils.chararray;

public class CharArrayUtils {
    public static char[] array(char ... v){
        return v;
    }

    public static char[][] array(char[] ... v){
        return v;
    }

    public static char[][] array2(int k,char ... v){
        int n = v.length / k;
        char[][] arr = new char[n][k];
        for (int i = 0; i < n; i++) {
            System.arraycopy(v, i * k, arr[i], 0, k);
        }
        return arr;
    }
}
