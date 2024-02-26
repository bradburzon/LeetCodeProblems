
public class MergeTwoSortedLinkedLists {
	/*
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */
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
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}
		if (list1.val <= list2.val) {
			return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
		} else {
			return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
		}
	}
}