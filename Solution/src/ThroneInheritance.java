import java.util.*;

public class ThroneInheritance {
    private final Node root;
    private final Map<String, Node> map;

    public ThroneInheritance(String kingName) {
        root = new Node();
        root.name = kingName;
        map = new HashMap<>(10_0000);
        map.put(kingName, root);
    }

    public void birth(String parentName, String childName) {
        Node children = new Node();
        children.name = childName;
        map.put(childName, children);
        Node parent = map.get(parentName);
        if (parent.children == null) {
            parent.children = children;
        } else {
            parent = parent.children;
            while (parent.brother != null) {
                parent = parent.brother;
            }
            parent.brother = children;
        }
    }

    public void death(String name) {
        map.get(name).death = true;
    }

    public List<String> getInheritanceOrder() {
        List<String> list = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            if (!temp.death) {
                list.add(temp.name);
            }
            if (temp.brother != null) {
                stack.push(temp.brother);
            }
            if (temp.children != null) {
                stack.push(temp.children);
            }
        }
        return list;
    }

    private static class Node {
        String name;
        boolean death;
        Node brother;
        Node children;
    }
}
