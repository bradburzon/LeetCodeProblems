import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MergeTwoSortedLinkedListsTest {
	private MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();
	private MergeTwoSortedLinkedLists.Solution solution = mergeTwoSortedLinkedLists.new Solution();
	
	@Test
	void givenTwoEmptyLinkedListWhenMergeTwoListsIsCalledThenReturnNull() {
		MergeTwoSortedLinkedLists.ListNode listNode1 = null;
		MergeTwoSortedLinkedLists.ListNode listNode2 = null;
		
		MergeTwoSortedLinkedLists.ListNode actual = solution.mergeTwoLists(listNode1, listNode2);
		
		assertEquals(null, actual);
	}
	
	@Test
	void givenOneEmptyLinkedListWhenMergeTwoListsIsCalledThenReturnTheOtherLinkedList() {
		MergeTwoSortedLinkedLists.ListNode listNode1 = mergeTwoSortedLinkedLists.new ListNode(1, null);
		MergeTwoSortedLinkedLists.ListNode listNode2 = null;
		
		MergeTwoSortedLinkedLists.ListNode actual = solution.mergeTwoLists(listNode1, listNode2);
		
		assertEquals(listNode1, actual);
	}
	
	@Test
	void givenTwoNonEmptyArrayWhenMergeTwoListsIsCalledThenReturnSortedLinkedList() {
		MergeTwoSortedLinkedLists.ListNode listNode2 = mergeTwoSortedLinkedLists.new ListNode(2, null);
		
		
		MergeTwoSortedLinkedLists.ListNode listNode4 = mergeTwoSortedLinkedLists.new ListNode(4, null);		
		MergeTwoSortedLinkedLists.ListNode actual = solution.mergeTwoLists(listNode2, listNode4);
		
		MergeTwoSortedLinkedLists.ListNode expected =  mergeTwoSortedLinkedLists.new ListNode(2, listNode4);
		System.out.println(expected.val + " : " + actual.val);
		System.out.println(expected.next.val + " : " + actual.next.val);
		System.out.println(expected.next.next + " : "  + actual.next.next);
		assertEquals(expected.val, actual.val);
		assertEquals(expected.next.val, actual.next.val);
		assertEquals(expected.next.next, actual.next.next);
	}
	

}
