import java.util.Stack;

public class Solution {
    public String reverseParentheses(String s) {
        final StringBuilder builder = new StringBuilder();
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int [] next = new int[n];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }else if(c == ')'){
                int j = stack.pop();
                next[i] = j;
                next[j] = i;
            }
        }

        int direction = 1;
        for (int i = 0; i < n; i+=direction) {
            char c = s.charAt(i);
            if(c == '(' || c == ')'){
                i = next[i];
                direction = -direction;
            }else{
                builder.append(c);
            }
        }
        return builder.toString();
    }
}