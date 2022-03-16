import java.util.HashMap;
import java.util.Map;

public class AllOne {
    private final CountNodeList countNodeList = new CountNodeList();
    private final Map<String, StrNode> strNodeMap = new HashMap<>();
    private final Map<CountNode, StrNodeList> strNodeListMap = new HashMap<>();
    private final Map<Integer, CountNode> countNodeMap = new HashMap<>();

    public void inc(String key) {
        StrNode strNode = strNodeMap.get(key);
        if (strNode == null) {
            tryAddStrNode(new StrNode(1, key), countNodeList.top);
        } else {
            int count = strNode.count;
            CountNode countNode = countNodeMap.get(count);
            StrNodeList list = strNodeListMap.get(countNode);
            CountNode upCountNode = tryRemoveStrNode(strNode);
            ++strNode.count;
            tryAddStrNode(strNode, list.isEmpty() ? upCountNode : countNode);
        }
    }

    public void dec(String key) {
        StrNode strNode = strNodeMap.get(key);
        CountNode upCountNode = tryRemoveStrNode(strNode);
        if (strNode.count > 1) {
            --strNode.count;
            tryAddStrNode(strNode, upCountNode);
        } else {
            strNodeMap.remove(key);
        }
    }

    private void tryAddStrNode(StrNode strNode, CountNode upCountNode) {
        int count = strNode.count;
        CountNode countNode = countNodeMap.get(count);
        if (countNode == null) {
            countNode = new CountNode(count);
            countNodeList.insert(upCountNode, countNode);
            countNodeMap.put(count, countNode);
            StrNodeList list = new StrNodeList();
            list.insertHead(strNode);
            strNodeListMap.put(countNode, list);
        } else {
            strNodeListMap.get(countNode).insertHead(strNode);
        }
        strNodeMap.put(strNode.key, strNode);
    }

    private CountNode tryRemoveStrNode(StrNode strNode) {
        int count = strNode.count;
        CountNode countNode = countNodeMap.get(count);
        CountNode upCountNode = countNode.up;
        StrNodeList list = strNodeListMap.get(countNode);
        list.remove(strNode);
        if (list.isEmpty()) {
            strNodeListMap.remove(countNode);
            countNodeList.remove(countNode);
            countNodeMap.remove(count);
        }
        return upCountNode;
    }

    public String getMaxKey() {
        return countNodeList.isEmpty() ? "" : strNodeListMap.get(countNodeMap.get(countNodeList.maxCount())).get();
    }

    public String getMinKey() {
        return countNodeList.isEmpty() ? "" : strNodeListMap.get(countNodeMap.get(countNodeList.minCount())).get();
    }

    private static class CountNodeList {
        CountNode top;
        CountNode bottom;

        public CountNodeList() {
            top = new CountNode(0);
            bottom = new CountNode(Integer.MAX_VALUE);
            top.down = bottom;
            bottom.up = top;
        }

        public void insert(CountNode pre, CountNode node) {
            pre.down.up = node;
            node.down = pre.down;
            pre.down = node;
            node.up = pre;
        }

        public void remove(CountNode node) {
            node.up.down = node.down;
            node.down.up = node.up;
        }

        public boolean isEmpty() {
            return top.down == bottom;
        }

        public int maxCount() {
            return bottom.up.count;
        }

        public int minCount() {
            return top.down.count;
        }
    }

    private static class CountNode {
        int count;
        CountNode up;
        CountNode down;

        public CountNode(int count) {
            this.count = count;
        }
    }

    private static class StrNodeList {
        StrNode head;
        StrNode tail;

        public StrNodeList() {
            head = new StrNode(0, "");
            tail = new StrNode(0, "");
            head.next = tail;
            tail.pre = head;
        }

        public void insertHead(StrNode node) {
            head.next.pre = node;
            node.next = head.next;
            head.next = node;
            node.pre = head;
        }

        public void remove(StrNode node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        public boolean isEmpty() {
            return head.next == tail;
        }

        public String get() {
            return head.next.key;
        }
    }

    private static class StrNode {
        int count;
        String key;
        StrNode pre;
        StrNode next;

        public StrNode(int count, String key) {
            this.count = count;
            this.key = key;
        }
    }
}
