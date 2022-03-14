import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int n1 = list1.length;
        int n2 = list2.length;
        Map<String, Integer> map = new HashMap<>(n1 * 2 / 3);
        for (int i = 0; i < n1; i++) {
            map.put(list1[i], i);
        }

        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n2 && i <= min; i++) {
            Integer index = map.get(list2[i]);
            if (index != null) {
                if (index + i < min) {
                    min = index + i;
                    list.clear();
                    list.add(list2[i]);
                } else if (index + i == min) {
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(String[]::new);
    }
}