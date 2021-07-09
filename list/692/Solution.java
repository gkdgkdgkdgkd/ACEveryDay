import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Node> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                ++map.get(s).ct;
            } else {
                map.put(s, new Node(s));
            }
        }

        PriorityQueue<Node> heap = new PriorityQueue<>((s1, s2) -> s1.ct == s2.ct ? s1.s.compareTo(s2.s) : (s2.ct - s1.ct));

        for (Node node : map.values()) {
            heap.offer(node);
        }

        List<String> list = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            list.add(heap.poll().s);
        }
        return list;
    }

    private static class Node {
        String s;
        int ct;

        public Node(String s) {
            ct = 1;
            this.s = s;
        }
    }
}