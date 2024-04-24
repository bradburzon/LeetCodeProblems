import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryLinkedListToIntegerTest {
    BinaryLinkedListToInteger binaryLinkedListToInteger;

    @Before
    public void setUp() {
        binaryLinkedListToInteger = new BinaryLinkedListToInteger();
    }

    @Test
    public void getDecimalValue_EmptyLinkedList_ReturnZero() {
        ListNode head = new ListNode();

        int actual = binaryLinkedListToInteger.getDecimalValue(head);

        assertEquals(0, actual);
    }

    @Test
    public void getDecimalValue_SingleOneNode_ReturnZero() {
        ListNode head = new ListNode(1);

        int actual = binaryLinkedListToInteger.getDecimalValue(head);

        assertEquals(1, actual);
    }

    @Test
    public void getDecimalValue_101_Return5() {
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(1);
        ListNode zero = new ListNode(0);
        head.next = zero;
        zero.next = one;

        int actual = binaryLinkedListToInteger.getDecimalValue(head);

        assertEquals(5, actual);
    }

    @Test
    public void getDecimalValue_111_Return5() {
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(1);
        ListNode oneMore = new ListNode(1);
        head.next = one;
        one.next = oneMore;

        int actual = binaryLinkedListToInteger.getDecimalValue(head);

        assertEquals(7, actual);
    }

    @Test
    public void getDecimalValue_100_Return5() {
        ListNode head = new ListNode(1);
        ListNode zero = new ListNode(0);
        ListNode zeroMore = new ListNode(0);
        head.next = zero;
        zero.next = zeroMore;

        int actual = binaryLinkedListToInteger.getDecimalValue(head);

        assertEquals(4, actual);
    }
}