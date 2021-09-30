import java.util.*;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>(paths.size());
        for (List<String> path : paths) {
            set.add(path.get(0));
        }
        for (List<String> path:paths){
            String end = path.get(1);
            if(!set.contains(end)){
                return end;
            }
        }
        return "";
    }
}