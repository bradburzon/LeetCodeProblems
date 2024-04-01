public class MaximumTwinSumLinkedList {
    public int pairSum(ListNode head) {
        int size = 0;
        ListNode reverse = reverseList(head);
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        size = (size / 2);
        int max = head.val + reverse.val;
        while(size > 0 && head != null && reverse != null){
            size--;
            max = Math.max(max, head.val + reverse.val);
            head = head.next;
            reverse = reverse.next;
        }
        return max;
    }

    public ListNode reverseList(ListNode head) {
        for (ListNode ans = null;; head = head.next) {
            if (head == null) {
                return ans;
            }
            ans = new ListNode(head.val, ans);
        }
    }
}