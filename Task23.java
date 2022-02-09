package Sobes;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task23 {
    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode headFake = new ListNode(0);
        ListNode head = headFake;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                pq.add(list);
            }
        }
        while (!pq.isEmpty()){
            ListNode cur = pq.poll();
            if (cur.next != null){
                pq.add(cur.next);
            }
            head.next = cur;
            head = head.next;
        }
        return headFake.next;
    }
}
