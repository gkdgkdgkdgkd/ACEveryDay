import node.ListNode;

import java.util.*;

public class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        list.sort(Comparator.naturalOrder());
        temp = head;
        int index = 0;
        while (temp != null){
            temp.val = list.get(index++);
            temp = temp.next;
        }
        return head;
    }
}