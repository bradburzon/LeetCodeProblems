import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MergeTwoSortedLinkedListsTest {
    private final MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();

    @Test
    void givenTwoEmptyLinkedListWhenMergeTwoListsIsCalledThenReturnNull() {
        ListNode actual = mergeTwoSortedLinkedLists.mergeTwoLists(null, null);

        assertNull(actual);
    }

    @Test
    void givenOneEmptyLinkedListWhenMergeTwoListsIsCalledThenReturnTheOtherLinkedList() {
        ListNode listNode1 = new ListNode(1, null);

        ListNode actual = mergeTwoSortedLinkedLists.mergeTwoLists(listNode1, null);

        assertEquals(listNode1, actual);
    }

    @Test
    void givenTwoNonEmptyArrayWhenMergeTwoListsIsCalledThenReturnSortedLinkedList() {
        ListNode listNode2 = new ListNode(2, null);

        ListNode listNode4 = new ListNode(4, null);
        ListNode actual = mergeTwoSortedLinkedLists.mergeTwoLists(listNode2, listNode4);

        ListNode expected = new ListNode(2, listNode4); 
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next, actual.next.next);
    }
}