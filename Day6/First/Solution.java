import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()"));
    }

    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        char a = s.charAt(0);
        if (a != '(' && a != '[' && a != '{')
            return false;
        StringBuilder t = new StringBuilder();
        int len = -1;
        for(char c:s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{')
            {
                t.append(c);
                ++len;
            }
            else
            {
                if(len == -1)
                    return false;
                char cc = t.charAt(len);
                if(
                    (c == ')' && cc != '(')
                    ||
                    (c == ']' && cc != '[')
                    ||
                    (c == '}' && cc != '{')
                )
                    return false;
                t.deleteCharAt(len--);
            }
        }
        return len == -1;
    }
}