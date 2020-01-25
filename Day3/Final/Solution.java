import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("23").toString());
    }

    String [] s = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits!=null && !digits.isEmpty())
            one(digits,0, new StringBuilder());
        return result;
    }

    public void one(String digits,int index,StringBuilder temp)
    {
        if(index < digits.length())
        {
            String d = s[digits.charAt(index)-'0'];
            for(int i=0;i<d.length();++i)
            {
                one(digits,index+1,temp.append(d.charAt(i)));
                temp.deleteCharAt(index);
            }
        }
        else
            result.add(temp.toString());
    }
}
