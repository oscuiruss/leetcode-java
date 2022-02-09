package Sobes;

public class Task2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(9);
        ListNode l11 = new ListNode(5);
        ListNode l12 = new ListNode(6);
        ListNode l13 = new ListNode(4);
        ListNode l14 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        ListNode list = addTwoNumbers(l1, l11);
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode headFake = new ListNode(0);
        ListNode head = headFake;
        while (l1 != null || l2 != null || sum > 0) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            sum += a;
            sum += b;
            headFake.next = new ListNode(sum % 10);
            headFake = headFake.next;
            sum /= 10;
        }
        return head.next;
    }
}
