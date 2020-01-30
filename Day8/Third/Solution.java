import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        new Solution().generateParenthesis(4).stream().forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) 
    {
        List<String> s = f(n);
        return s;
    }

    public List<String> f(int n)
    {
        List<String> s = new ArrayList<>();
        if(n == 0)
            s.add("");
        for(int i=0;i<n;++i)
        {
            List<String> l = f(i);
            List<String> r = f(n-i-1);
            for(String ll:l)
            {
                for(String rr:r)
                {
                    s.add("("+ll+")"+rr);
                }
            }
        }
        return s;
    }
}