public class ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode reverseList(ListNode head) {
        for(ListNode ans = null;; head = head.next){
            if(head  == null){
                return ans;
            }
            ans = new ListNode(head.val, ans);
        }
    }
}