import java.util.*;

public class Solution {
    private final Map<List<Integer>, Integer> map = new HashMap<>(65536);

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        if (needs.stream().noneMatch(i -> i > 0)) {
            return 0;
        }
        int n = price.size();
        for (Iterator<List<Integer>> iterator = special.iterator(); iterator.hasNext(); ) {
            List<Integer> list = iterator.next();
            int val = list.get(n);
            list.remove(n);
            Integer oldV = map.get(list);
            if (oldV == null) {
                map.put(list, val);
            } else {
                iterator.remove();
                if (oldV > val) {
                    map.put(list, val);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(0);
            }
            list.set(i, 1);
            Integer oldV = map.get(list);
            if (oldV == null) {
                map.put(list, price.get(i));
                special.add(list);
            } else if (price.get(i) < oldV) {
                map.put(list, price.get(i));
            }
        }
        for (List<Integer> list : special) {
            dfs(list, special, needs, n, map.get(list));
        }
        return map.get(needs);
    }

    private void dfs(List<Integer> cur, List<List<Integer>> special, List<Integer> needs, int n, int curVal) {
        for (List<Integer> price : special) {
            int i = 0;
            List<Integer> temp = new ArrayList<>();
            while (i < n) {
                int v = cur.get(i) + price.get(i);
                if (v > needs.get(i)) {
                    break;
                }
                temp.add(v);
                ++i;
            }
            if (i < n) {
                continue;
            }
            int p = curVal + map.get(price);
            Integer oldV = map.get(temp);
            if (oldV == null || oldV > p) {
                map.put(temp, p);
                dfs(temp, special, needs, n, p);
            }
        }
    }
}