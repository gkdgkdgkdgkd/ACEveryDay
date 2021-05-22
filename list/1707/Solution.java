import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int n = queries.length;
        int [] res = new int[n];
        Arrays.sort(nums);

        Integer[] queriesIdx = new Integer[n];
        for (int i = 0; i < n; i++) {
            queriesIdx[i] = i;
        }
        Arrays.sort(queriesIdx, Comparator.comparingInt(a -> queries[a][1]));
        Trie trie = new Trie();
        int numIndex = 0;
        for (int i = 0; i < n; i++) {
            while(numIndex < nums.length && nums[numIndex] <= queries[queriesIdx[i]][1]) {
                trie.insert(nums[numIndex],nums[nums.length-1]);
                ++numIndex;
            }
            res[queriesIdx[i]] = trie.get(queries[queriesIdx[i]][0],nums[nums.length-1]);
        }
        return res;
    }

    private static class TrieNode{
        int val;
        TrieNode [] next = new TrieNode[2];

        public TrieNode(){}

        public TrieNode(int val){
            this.val = val;
        }
    }

    private static class Trie{
        TrieNode root = new TrieNode(1);

        public void insert(int num,int maxNum){
            TrieNode node = root;
            char[] chars = binaryToDecimal(num,Integer.toBinaryString(maxNum).length()).toCharArray();
            int len = chars.length;

            for (int i = 0; i < len; i++) {
                char c = chars[i];
                if(c == '0'){
                    if(node.next[0] == null){
                        node.next[0] = new TrieNode();
                    }
                    node = node.next[0];
                }else{
                    if(node.next[1] == null){
                        node.next[1] = new TrieNode();
                    }
                    node = node.next[1];
                }
            }
            node.val = num;
        }

        public int get(int num,int maxNum){
            TrieNode node = root;
            if(node.next[0] == null && node.next[1] == null){
                return -1;
            }
            char[] chars = binaryToDecimal(num,Integer.toBinaryString(maxNum).length()).toCharArray();
            int len = chars.length;
            for (int i = 0; i < len; i++) {
                char c = chars[i];
                if(c == '0'){
                    if(node.next[1] != null){
                        node = node.next[1];
                    }else{
                        node = node.next[0];
                    }
                }else {
                    if(node.next[0] != null){
                        node = node.next[0];
                    }else{
                        node = node.next[1];
                    }
                }
            }
            return node.val ^ num;
        }

        private String binaryToDecimal(int decNum,int digit){
            StringBuilder builder = new StringBuilder();
            for (int i = digit-1; i >= 0; --i) {
                builder.append((decNum>>i)&1);
            }
            return builder.toString();
        }
    }
}