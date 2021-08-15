package utils.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListUtils {
    public static List<Integer> listOf(int ... v){
        List<Integer> list = new ArrayList<>(v.length);
        for (int vv:v){
            list.add(vv);
        }
        return list;
    }

    public static List<String> listOf(String ... v){
        return Arrays.asList(v);
    }
}
