import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        new Solution().generateParenthesis(3).stream().forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<>();
        f("",n,0,0,s);
        return s;
    }

    public void f(String c,int n,int l,int r,List<String> result)
    {
        if(l == n && r == n)
            result.add(c);
        else
        {
            if(l < r)
                return ;
            if(l < n)
                f(c+"(",n,l+1,r,result);
            if(r < n)
                f(c+")",n,l,r+1,result);
        }
    }
}
