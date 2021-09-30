import node.TreeNode;
import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<>() {{
            add("A");
            add("Z");
        }});
//        list.add(new ArrayList<>() {{
//            add("D");
//            add("B");
//        }});
//        list.add(new ArrayList<>() {{
//            add("C");
//            add("A");
//        }});
        Utils.print(list);
        Utils.print(SOLUTION.destCity(list));
    }
}