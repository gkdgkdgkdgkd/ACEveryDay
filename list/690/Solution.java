import java.util.*;

public class Solution {
    private Map<Integer,Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>(employees.size());
        for(Employee employee:employees){
            map.put(employee.id,employee);
        }
        return f(id);
    }

    private int f(int id){
        int sum = map.get(id).importance;
        for (int i:map.get(id).subordinates){
            sum += f(i);
        }
        return sum;
    }
}