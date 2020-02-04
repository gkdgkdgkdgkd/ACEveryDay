import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) 
    {
        new Solution().generateParenthesis(4).stream().forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) 
    {
        List<List<String>> s = new ArrayList<>();
        s.add(Arrays.asList(""));
        s.add(Arrays.asList("()"));
        for(int n1 = 2;n1<=n;++n1)
        {
            List<String> t = new ArrayList<>();
            for(int i=0;i<n1;++i)
            {
                List<String> l = s.get(i);
                List<String> r = s.get(n1-i-1);
                for(String ll:l)
                {
                    for(String rr:r)
                    {
                        t.add("("+ll+")"+rr);
                    }
                }
            }
            s.add(t);
        }
        return s.get(n);
    }
}
