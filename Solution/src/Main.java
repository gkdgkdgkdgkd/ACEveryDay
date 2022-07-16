import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        MovingAverage average = new MovingAverage(5);
        int[] arr = Utils.array(12009,1965,-940,-8516,-16446,7870,25545,-21028,18430,-23464);
        for (int v:arr){
            Utils.print(average.next(v));
        }
    }
}