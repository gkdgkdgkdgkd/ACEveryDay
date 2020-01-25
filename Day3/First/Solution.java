import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("2345").toString());
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits!=null && !digits.isEmpty())
        {
            HashMap<Integer, String> s = new HashMap<>();
            s.put(2, "abc");
            s.put(3, "def");
            s.put(4, "ghi");
            s.put(5, "jkl");
            s.put(6, "mno");
            s.put(7, "pqrs");
            s.put(8, "tuv");
            s.put(9, "wxyz");
            one(digits, result, s, "");
        }
        return result;
    }

    public void one(String digits,List<String> result,HashMap<Integer,String> ss,String temp)
    {
        if(digits.length() > 0)
        {
            String s = ss.get((int)(digits.charAt(0))-48);
            for(int i=0;i<s.length();++i)
                one(digits.substring(1),result,ss,temp+s.charAt(i));
        }
        else
            result.add(temp);
    }
}
