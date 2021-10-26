import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TimeMap {
    private final Map<String, LinkedList<Node>> map = new HashMap<>();

    public void set(String key, String value, int timestamp) {
        Node node = new Node(value,timestamp);
        if(map.containsKey(key)){
            map.get(key).addLast(node);
        }else{
            LinkedList<Node> list = new LinkedList<>();
            list.add(node);
            map.put(key,list);
        }
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        LinkedList<Node> list = map.get(key);
        for (int i = list.size()-1; i >= 0; --i) {
            Node node = list.get(i);
            if(node.timestamp <= timestamp){
                return node.value;
            }
        }
        return "";
    }

    private static class Node{
        String value;
        int timestamp;

        public Node(String value,int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}