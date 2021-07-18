import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>(strs.length);
        List<List<String>> res = new LinkedList<>();
        for (String s : strs) {
            int key = hash(s);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> list = new LinkedList<>();
                list.add(s);
                res.add(list);
                map.put(key, list);
            }
        }
        return res;
    }

    private int hash(String s) {
        int h = 0;
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (char c : ch) {
            h = h * 31 + c;
        }
        return h;
    }
}