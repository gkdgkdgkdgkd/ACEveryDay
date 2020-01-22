import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) {
        for(List<Integer> t:threeSum(new int[]{1,2,-2,-1,0,3}))
        {
            System.out.println(t.get(0)+"+"+t.get(1)+"+"+t.get(2)+"=0");
        }
    }

    public static List<List<Integer>> threeSum(int [] nums)
    {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;++i)
        {
            for(int j=0;j<nums.length;++j)
            {
                for(int k=0;k<nums.length;++k)
                {
                    if(nums[i]+nums[j]+nums[k] == 0)
                    {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(nums[i]);
                        arrayList.add(nums[j]);
                        arrayList.add(nums[k]);
                        result.add(arrayList);
                    }
                }
            }
        }
        List<List<Integer>> finalList = new ArrayList<>();
        finalList.addAll(result);
        return finalList;
    }
}