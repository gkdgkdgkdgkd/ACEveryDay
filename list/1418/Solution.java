import java.util.*;

public class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> map = new HashMap<>(512);
        Set<String> foods = new HashSet<>();
        String[] numberToString = new String[512];
        int n = orders.size();
        for (int i = 0; i < n; i++) {
            String tableStr = orders.get(i).get(1);
            Integer table = Integer.parseInt(tableStr);
            numberToString[table] = tableStr;
            String food = orders.get(i).get(2);
            foods.add(food);
            if (map.containsKey(table)) {
                map.get(table).put(food, map.get(table).getOrDefault(food, 0) + 1);
            }else{
                Map<String,Integer> temp = new HashMap<>();
                temp.put(food,1);
                map.put(table,temp);
            }
        }
        int foodsSize = foods.size();
        foods = new TreeSet<>(foods);
        map = new TreeMap<>(map);
        List<List<String>> list = new ArrayList<>(map.size()+1);
        List<String> temp = new ArrayList<>(foodsSize+1);
        temp.add("Table");
        temp.addAll(foods);
        list.add(temp);
        for (Map.Entry<Integer,Map<String,Integer>> entry:map.entrySet()){
            temp = new ArrayList<>(foodsSize+1);
            temp.add(numberToString[entry.getKey()]);
            Map<String,Integer> foodsMap = entry.getValue();
            for (String s:foods){
                temp.add(String.valueOf(foodsMap.getOrDefault(s,0)));
            }
            list.add(temp);
        }
        return list;
    }
}