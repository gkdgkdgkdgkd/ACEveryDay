public class Solution {
    public String orderlyQueue(String s, int k) {
        if(k == 1){
            StringBuilder b = new StringBuilder(s);
            int n = s.length();
            String res = s;
            for(int i=0;i<n;++i){
                b.append(b.charAt(0));
                b.deleteCharAt(0);
                if(b.toString().compareTo(res) < 0){
                    res = b.toString();
                }
            }
            return res;
        }else{
            char[] c = s.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }
    }
}
