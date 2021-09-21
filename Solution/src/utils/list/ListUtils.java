package utils.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {
    @SafeVarargs
    public static <T> List<T> listOf(T... v) {
        return new ArrayList<>(v.length) {
            {
                addAll(Arrays.asList(v));
            }
        };
    }
}
