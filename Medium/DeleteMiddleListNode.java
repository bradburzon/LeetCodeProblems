public class DeleteMiddleListNode {
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

    public ListNode deleteMiddle(ListNode head) {
        int middle = size(head) / 2;
        return deleteUntil(middle, head);
    }

    public ListNode deleteUntil(int n, ListNode node) {
        if (n == 0) {
            return node.next;
        } else {
            return new ListNode(node.val, deleteUntil(n - 1, node.next));
        }
    }

    public int size(ListNode node) {
        if (node == null) {
            return 0;
        } else {
            node = node.next;
            return 1 + size(node);
        }
    }
}