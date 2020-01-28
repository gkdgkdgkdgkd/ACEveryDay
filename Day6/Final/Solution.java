import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{[]([{}])}"));
    }

    public boolean isValid(String s) {
        char[] t = new char[s.length() + 1];
        int p = 1;
        for (char c : s.toCharArray()) 
        {
            if (c == '(' || c == '[' || c == '{')
                t[p++] = c;
            else 
            {
                --p;
                if ((c == ')' && t[p] != '(') || (c == ']' && t[p] != '[') || (c == '}' && t[p] != '{'))
                    return false;
            }
        }
        return p == 1;
    }
}