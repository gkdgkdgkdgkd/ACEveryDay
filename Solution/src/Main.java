import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        int n = 6;
//        List<Integer> price = Arrays.stream(Utils.randomArray(n, 0, 10)).boxed().collect(Collectors.toList());
//        int len = 100;
//        List<List<Integer>> special = new ArrayList<>();
//        for (int i = 0; i < len; i++) {
//            List<Integer> list = Arrays.stream(Utils.randomArray(n, 0, 10)).boxed().collect(Collectors.toList());
//            list.add(Utils.randomInt(0, 50));
//            special.add(list);
//        }
//        List<Integer> needs = Arrays.stream(Utils.randomArray(n,0,10)).boxed().collect(Collectors.toList());
//        Utils.print(price);
//        Utils.print(special);
//        Utils.print(needs);
        Utils.print(SOLUTION.shoppingOffers(Utils.listOf(2, 3), Utils.listOf(
                        Utils.listOf(1, 0, 1), Utils.listOf(0, 1, 2)
                ),
                Utils.listOf(1, 1)));
    }
}