import java.util.*;

public class Solution {
    public String largestNumber(int[] cost, int target) {
        int [] costToNum = new int[5001];
        for (int i = 0; i < cost.length; i++) {
            if(i+1 > costToNum[cost[i]]) {
                costToNum[cost[i]] = i + 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        cost = new int[5001];
        for (int i = 0; i <= 5000; i++) {
            if(costToNum[i] != 0) {
                list.add(costToNum[i]);
                cost[costToNum[i]] = i;
            }
        }
        int [] nums = list.stream().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();

        Node []dp = new Node[target+1];
        dp[0] = new Node(new StringBuilder(),0);
        for (int i = 1; i <= target; i++) {
            dp[i] = new Node(new StringBuilder(),0);
            for (int j = 0; j < nums.length; j++) {
                int index = i - cost[nums[j]];
                if(index >= 0 && dp[index].target + cost[nums[j]] == i){
                    StringBuilder temp = new StringBuilder(dp[index].builder);
                    temp.insert(0, nums[j]);
                    int len1 = temp.length();
                    int len2 = dp[i].builder.length();
                    if (len1 > len2 || (len1 == len2 && temp.compareTo(dp[i].builder) > 0)) {
                        dp[i] = new Node(temp,i);
                    }
                }
            }
        }
        if(dp[target].builder.length() == 0){
            return "0";
        }
        return dp[target].builder.toString();
    }

    private static class Node{
        StringBuilder builder;
        int target;
        public Node(StringBuilder builder,int target){
            this.builder = builder;
            this.target = target;
        }
    }
}