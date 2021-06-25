import java.util.*;

public class Solution {
    private static final String ZERO = "0000";

    public int openLock(String[] deadends, String target) {
        if(target.equals(ZERO)) {
            return 0;
        }

        final Set<String> dead = new HashSet<>();
        for(String s:deadends){
            dead.add(s);
            if(s.equals(ZERO)){
                return -1;
            }
        }

        int res = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(ZERO);
        Set<String> visit = new HashSet<>();
        visit.add(ZERO);

        while (!queue.isEmpty()){
            ++res;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.remove();
                for(String s:get(str)){
                    if(!dead.contains(s) && !visit.contains(s)){
                        if(s.equals(target)){
                            return res;
                        }
                        queue.offer(s) ;
                        visit.add(s);
                    }
                }
            }
        }
        return -1;
    }

    public char numPrev(char x) {
        return x == '0' ? '9' : (char) (x - 1);
    }

    public char numSucc(char x) {
        return x == '9' ? '0' : (char) (x + 1);
    }

    public List<String> get(String status) {
        List<String> ret = new ArrayList<String>();
        char[] array = status.toCharArray();
        for (int i = 0; i < 4; ++i) {
            char num = array[i];
            array[i] = numPrev(num);
            ret.add(new String(array));
            array[i] = numSucc(num);
            ret.add(new String(array));
            array[i] = num;
        }
        return ret;
    }
}