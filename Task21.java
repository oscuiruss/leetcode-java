public class Task21 {
    public static void main(String[] args) {
        String[] a = new String[]{"f", "l"};
    }

    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = null;
        ListNode head = null;
        if (list1 != null && list2 != null){
            if (list1.val < list2.val){
                newList = head = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                newList = head = new ListNode(list2.val);
                list2 = list2.next;
            }
        } else if (list1 != null){
            head = list1;
        } else if (list2 != null){
            head = list2;
        }

        while (list1 != null || list2 != null){
            if (list1 != null && list2 != null){
                if (list1.val < list2.val){
                    newList.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    newList.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            } else {
                if (list1 == null){
                    newList.next = new ListNode(list2.val);
                    list2 = list2.next;
                } else {
                    newList.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
            }
            newList = newList.next;
        }
        return head;
    }
}