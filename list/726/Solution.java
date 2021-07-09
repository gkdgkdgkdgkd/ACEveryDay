import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {
    private char[] formula;
    private static final String BRACKET = "bracket";

    public String countOfAtoms(String formula) {
        this.formula = formula.toCharArray();
        TreeMap<String, Integer> map = new TreeMap<>(count(this.formula));
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(!entry.getKey().equals(BRACKET)) {
                builder.append(entry.getKey());
                int value = entry.getValue();
                if (value != 1) {
                    builder.append(value);
                }
            }
        }
        return builder.toString();
    }

    private Map<String, Integer> count(char[] formula) {
        int n = formula.length;
        Stack<Map> stack = new Stack<>();
        for (int i = 0; i < n; ) {
            if (Character.isUpperCase(formula[i])) {
                StringBuilder atom = new StringBuilder();
                atom.append(formula[i++]);
                while (i < n && Character.isLowerCase(formula[i])) {
                    atom.append(formula[i++]);
                }
                Map<String, Integer> map = new HashMap<>();
                map.put(atom.toString(), 1);
                stack.push(map);
            } else if (Character.isDigit(formula[i])) {
                StringBuilder number = new StringBuilder();
                number.append(formula[i++]);
                while (i < n && Character.isDigit(formula[i])) {
                    number.append(formula[i++]);
                }
                int pow = (int)Math.pow(10,number.length()-1);
                int num = 0;
                for (char c:number.toString().toCharArray()){
                    num += (c-'0') * pow;
                    pow /= 10;
                }
                Map<String, Integer> map = stack.pop();
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (!entry.getKey().equals(BRACKET)) {
                        entry.setValue(entry.getValue() * num);
                    }
                }
                stack.push(map);
            } else if (formula[i] == '(') {
                Map<String, Integer> map = new HashMap<>();
                map.put(BRACKET, 0);
                stack.push(map);
                ++i;
            } else {
                Map<String, Integer> map = stack.peek();
                Map<String, Integer> base = stack.pop();
                while (!map.containsKey(BRACKET)){
                    map = stack.pop();
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        if (!entry.getKey().equals(BRACKET)) {
                            base.put(entry.getKey(), base.getOrDefault(entry.getKey(), 0) + entry.getValue());
                        }
                    }
                }
                stack.push(base);
                ++i;
            }
        }
        Map<String,Integer> base = stack.pop();
        while(!stack.isEmpty()){
            Map<String,Integer> map = stack.pop();
            for (Map.Entry<String,Integer> entry:map.entrySet()){
                if (!entry.getKey().equals(BRACKET)) {
                    base.put(entry.getKey(), base.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }
            }
        }
        return base;
    }
}