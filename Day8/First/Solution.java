import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        new Solution().generateParenthesis(3).stream().forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<>();
        f(new char [2*n],0,s);
        return s;
    }

    public void f(char c[],int pos,List<String> result)
    {
        if(pos == c.length)
        {
            if(valid(c))
                result.add(Arrays.toString(c).replaceAll("(\\[)|(\\])| |,",""));
        }
        else
        {
            c[pos] = '(';
            f(c,pos+1,result);
            c[pos] = ')';
            f(c,pos+1,result);
        }
    }

    public boolean valid(char [] f)
    {
        int len = 0;
        for(char c:f)
        {
            if(c == '(' )
            {
                if(++len > f.length/2)
                    return false;
            }
            else if(len-- <=0)
                return false;
        }
        return len == 0;
    }
}
